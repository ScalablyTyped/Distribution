package typings.reactOverlays

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object esmUsePopperMod {
  
  type Instance = typings.popperjsCore.typesMod.Instance
  
  type Modifier[Name, Options] = typings.popperjsCore.typesMod.Modifier[Name, Options]
  
  type ModifierMap = typings.std.Record[java.lang.String, typings.reactOverlays.anon.PartialModifieranyany]
  
  type Offset = typings.reactOverlays.esmUsePopperMod.OffsetFunction | typings.reactOverlays.esmUsePopperMod.OffsetValue
  
  type OffsetFunction = js.Function1[
    /* details */ typings.reactOverlays.anon.Popper, 
    typings.reactOverlays.esmUsePopperMod.OffsetValue
  ]
  
  type OffsetValue = js.Tuple2[js.UndefOr[scala.Double | scala.Null], js.UndefOr[scala.Double | scala.Null]]
  
  type Options = typings.popperjsCore.typesMod.Options
  
  type Placement = typings.popperjsCore.enumsMod.Placement
  
  type State = typings.popperjsCore.typesMod.State
  
  type VirtualElement = typings.popperjsCore.typesMod.VirtualElement
}
