package typings.semanticDashUiDashSticky.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object StickySettings {
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.bottomOffset
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.className
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.context
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.debug
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.error
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.jitter
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.name
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.namespace
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.observeChanges
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.offset
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.onBottom
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.onReposition
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.onScroll
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.onStick
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.onTop
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.onUnstick
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.performance
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.pushing
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.scrollContext
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.setSize
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.silent
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.verbose
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    pushing | setSize | jitter | observeChanges | context | scrollContext | offset | bottomOffset | onReposition | onScroll | onStick | onUnstick | onTop | onBottom | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      pushing | setSize | jitter | observeChanges | context | scrollContext | offset | bottomOffset | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
