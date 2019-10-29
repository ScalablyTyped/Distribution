package typings.rotDashJs.rotDashJsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.rotDashJs.libMapArenaMod.default
import typings.rotDashJs.libMapCellularMod.Options
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Map")
@js.native
object Map extends js.Object {
  @js.native
  class Arena () extends default
  
  @js.native
  class Cellular protected ()
    extends typings.rotDashJs.libMapCellularMod.default {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, options: Partial[Options]) = this()
  }
  
  @js.native
  class Digger protected ()
    extends typings.rotDashJs.libMapDiggerMod.default {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, options: Partial[typings.rotDashJs.libMapDiggerMod.Options]) = this()
  }
  
  @js.native
  class DividedMaze ()
    extends typings.rotDashJs.libMapDividedmazeMod.default
  
  @js.native
  class EllerMaze ()
    extends typings.rotDashJs.libMapEllermazeMod.default
  
  @js.native
  class IceyMaze protected ()
    extends typings.rotDashJs.libMapIceymazeMod.default {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, regularity: Double) = this()
  }
  
  @js.native
  class Rogue protected ()
    extends typings.rotDashJs.libMapRogueMod.default {
    def this(width: Double, height: Double, options: Partial[typings.rotDashJs.libMapRogueMod.Options]) = this()
  }
  
  @js.native
  class Uniform protected ()
    extends typings.rotDashJs.libMapUniformMod.default {
    def this(width: Double, height: Double, options: Partial[typings.rotDashJs.libMapUniformMod.Options]) = this()
  }
  
  var Arena: Instantiable0[default] = js.native
  var Cellular: Instantiable3[
    /* width */ Double, 
    /* height */ Double, 
    js.UndefOr[/* options */ Partial[Options]], 
    typings.rotDashJs.libMapCellularMod.default
  ] = js.native
  var Digger: Instantiable3[
    /* width */ Double, 
    /* height */ Double, 
    js.UndefOr[/* options */ Partial[typings.rotDashJs.libMapDiggerMod.Options]], 
    typings.rotDashJs.libMapDiggerMod.default
  ] = js.native
  var DividedMaze: Instantiable0[typings.rotDashJs.libMapDividedmazeMod.default] = js.native
  var EllerMaze: Instantiable0[typings.rotDashJs.libMapEllermazeMod.default] = js.native
  var IceyMaze: Instantiable3[
    /* width */ Double, 
    /* height */ Double, 
    js.UndefOr[/* regularity */ Double], 
    typings.rotDashJs.libMapIceymazeMod.default
  ] = js.native
  var Rogue: Instantiable3[
    /* width */ Double, 
    /* height */ Double, 
    /* options */ Partial[typings.rotDashJs.libMapRogueMod.Options], 
    typings.rotDashJs.libMapRogueMod.default
  ] = js.native
  var Uniform: Instantiable3[
    /* width */ Double, 
    /* height */ Double, 
    /* options */ Partial[typings.rotDashJs.libMapUniformMod.Options], 
    typings.rotDashJs.libMapUniformMod.default
  ] = js.native
}

