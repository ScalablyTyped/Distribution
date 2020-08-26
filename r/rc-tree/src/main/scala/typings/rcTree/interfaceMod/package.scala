package typings.rcTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceMod {
  type GetCheckDisabled[RecordType] = js.Function1[/* record */ RecordType, scala.Boolean]
  type GetKey[RecordType] = js.Function2[
    /* record */ RecordType, 
    /* index */ js.UndefOr[scala.Double], 
    typings.rcTree.interfaceMod.Key
  ]
  type IconType = typings.react.mod.ReactNode | (js.Function1[/* props */ typings.rcTree.treeNodeMod.TreeNodeProps, typings.react.mod.ReactNode])
  type Key = java.lang.String | scala.Double
  type ScrollTo = js.Function1[/* scroll */ typings.rcTree.anon.Key, scala.Unit]
}
