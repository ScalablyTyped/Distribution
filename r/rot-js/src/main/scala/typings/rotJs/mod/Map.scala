package typings.rotJs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typings.rotJs.anon.PartialOptionsBorn
import typings.rotJs.anon.PartialOptionsCellHeight
import typings.rotJs.anon.PartialOptionsCorridorLength
import typings.rotJs.anon.PartialOptionsRoomDugPercentage
import typings.rotJs.arenaMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rot-js", "Map")
@js.native
object Map extends js.Object {
  
  @js.native
  class Arena () extends default
  @js.native
  object Arena extends TopLevel[Instantiable0[default]]
  
  @js.native
  class Cellular protected ()
    extends typings.rotJs.cellularMod.default {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, options: PartialOptionsBorn) = this()
  }
  @js.native
  object Cellular
    extends TopLevel[
          Instantiable3[
            /* width */ Double, 
            /* height */ Double, 
            /* options */ js.UndefOr[PartialOptionsBorn], 
            typings.rotJs.cellularMod.default
          ]
        ]
  
  @js.native
  class Digger protected ()
    extends typings.rotJs.diggerMod.default {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, options: PartialOptionsCorridorLength) = this()
  }
  @js.native
  object Digger
    extends TopLevel[
          Instantiable3[
            /* width */ Double, 
            /* height */ Double, 
            /* options */ js.UndefOr[PartialOptionsCorridorLength], 
            typings.rotJs.diggerMod.default
          ]
        ]
  
  @js.native
  class DividedMaze ()
    extends typings.rotJs.dividedmazeMod.default
  @js.native
  object DividedMaze
    extends TopLevel[Instantiable0[typings.rotJs.dividedmazeMod.default]]
  
  @js.native
  class EllerMaze ()
    extends typings.rotJs.ellermazeMod.default
  @js.native
  object EllerMaze
    extends TopLevel[Instantiable0[typings.rotJs.ellermazeMod.default]]
  
  @js.native
  class IceyMaze protected ()
    extends typings.rotJs.iceymazeMod.default {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, regularity: Double) = this()
  }
  @js.native
  object IceyMaze
    extends TopLevel[
          Instantiable3[
            /* width */ Double, 
            /* height */ Double, 
            /* regularity */ js.UndefOr[Double], 
            typings.rotJs.iceymazeMod.default
          ]
        ]
  
  @js.native
  class Rogue protected ()
    extends typings.rotJs.rogueMod.default {
    def this(width: Double, height: Double, options: PartialOptionsCellHeight) = this()
  }
  @js.native
  object Rogue
    extends TopLevel[
          Instantiable3[
            /* width */ Double, 
            /* height */ Double, 
            /* options */ PartialOptionsCellHeight, 
            typings.rotJs.rogueMod.default
          ]
        ]
  
  @js.native
  class Uniform protected ()
    extends typings.rotJs.uniformMod.default {
    def this(width: Double, height: Double, options: PartialOptionsRoomDugPercentage) = this()
  }
  @js.native
  object Uniform
    extends TopLevel[
          Instantiable3[
            /* width */ Double, 
            /* height */ Double, 
            /* options */ PartialOptionsRoomDugPercentage, 
            typings.rotJs.uniformMod.default
          ]
        ]
}
