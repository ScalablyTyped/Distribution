package typings.reactWithStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentClassProps[C] = js.Any
  type ElementConfig[C] = typings.react.mod._Global_.JSX.LibraryManagedAttributes[C, typings.reactWithStyles.mod.ElementProps[C]]
  type ElementProps[C] = typings.reactWithStyles.mod.SFCProps[C] | typings.reactWithStyles.mod.ComponentClassProps[C]
  type Nullable[T] = js.UndefOr[T | scala.Null]
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type SFCProps[C] = js.Any
  type Styles = org.scalablytyped.runtime.StringDictionary[
    typings.reactWithStyles.mod.Nullable[
      typings.aphrodite.cssPropertiesMod.CSSProperties with (org.scalablytyped.runtime.StringDictionary[
        js.UndefOr[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 259 */ js.Any
        ]
      ])
    ]
  ]
  type Theme = org.scalablytyped.runtime.StringDictionary[js.Any]
}
