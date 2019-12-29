package typings.reactDashWithDashStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashWithDashStylesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.aphrodite.typingsCssDashPropertiesMod.CSSProperties
  import typings.react.reactMod._Global_.JSX.LibraryManagedAttributes
  import typings.std.Exclude
  import typings.std.Pick

  type ComponentClassProps[C] = js.Any
  type ElementConfig[C] = LibraryManagedAttributes[C, ElementProps[C]]
  type ElementProps[C] = SFCProps[C] | ComponentClassProps[C]
  type Nullable[T] = js.UndefOr[T | Null]
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type SFCProps[C] = js.Any
  type Styles = StringDictionary[
    Nullable[
      CSSProperties with (StringDictionary[
        js.UndefOr[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 259 */ js.Any
        ]
      ])
    ]
  ]
  type Theme = StringDictionary[js.Any]
}
