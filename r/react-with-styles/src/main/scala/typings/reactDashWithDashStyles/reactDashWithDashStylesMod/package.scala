package typings.reactDashWithDashStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashWithDashStylesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.aphrodite.aphroditeMod.CSSProperties
  import typings.react.reactMod.Global.JSXNs.LibraryManagedAttributes

  type ComponentClassProps[C] = js.Any
  type ElementConfig[C] = LibraryManagedAttributes[C, ElementProps[C]]
  type ElementProps[C] = SFCProps[C] | ComponentClassProps[C]
  type Nullable[T] = js.UndefOr[T | Null]
  type SFCProps[C] = js.Any
  type Styles = StringDictionary[
    Nullable[
      CSSProperties with (StringDictionary[
        (/* import warning: ImportType.apply Failed type conversion: aphrodite.aphrodite.CSSProperties[keyof aphrodite.aphrodite.CSSProperties] */ js.Any) | CSSProperties
      ])
    ]
  ]
  type Theme = StringDictionary[js.Any]
}
