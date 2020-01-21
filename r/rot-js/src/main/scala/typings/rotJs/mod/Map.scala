package typings.rotJs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typings.rotJs.arenaMod.default
import typings.rotJs.cellularMod.Options
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
    extends typings.rotJs.cellularMod.default {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, options: Partial[Options]) = this()
  }
  
  @js.native
  class Digger protected ()
    extends typings.rotJs.diggerMod.default {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, options: Partial[typings.rotJs.diggerMod.Options]) = this()
  }
  
  @js.native
  class DividedMaze ()
    extends typings.rotJs.dividedmazeMod.default
  
  @js.native
  class EllerMaze ()
    extends typings.rotJs.ellermazeMod.default
  
  @js.native
  class IceyMaze protected ()
    extends typings.rotJs.iceymazeMod.default {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, regularity: Double) = this()
  }
  
  @js.native
  class Rogue protected ()
    extends typings.rotJs.rogueMod.default {
    def this(width: Double, height: Double, options: Partial[typings.rotJs.rogueMod.Options]) = this()
  }
  
  @js.native
  class Uniform protected ()
    extends typings.rotJs.uniformMod.default {
    def this(width: Double, height: Double, options: Partial[typings.rotJs.uniformMod.Options]) = this()
  }
  
  @js.native
  object Arena extends TopLevel[Instantiable0[default]]
  
  @js.native
  object Cellular
    extends TopLevel[
          Instantiable3[
            /* width */ Double, 
            /* height */ Double, 
            js.UndefOr[/* options */ Partial[Options]], 
            typings.rotJs.cellularMod.default
          ]
        ]
  
  @js.native
  object Digger
    extends TopLevel[
          Instantiable3[
            /* width */ Double, 
            /* height */ Double, 
            js.UndefOr[/* options */ Partial[typings.rotJs.diggerMod.Options]], 
            typings.rotJs.diggerMod.default
          ]
        ]
  
  @js.native
  object DividedMaze
    extends TopLevel[Instantiable0[typings.rotJs.dividedmazeMod.default]]
  
  @js.native
  object EllerMaze
    extends TopLevel[Instantiable0[typings.rotJs.ellermazeMod.default]]
  
  @js.native
  object IceyMaze
    extends TopLevel[
          Instantiable3[
            /* width */ Double, 
            /* height */ Double, 
            js.UndefOr[/* regularity */ Double], 
            typings.rotJs.iceymazeMod.default
          ]
        ]
  
  @js.native
  object Rogue
    extends TopLevel[
          Instantiable3[
            /* width */ Double, 
            /* height */ Double, 
            /* options */ Partial[typings.rotJs.rogueMod.Options], 
            typings.rotJs.rogueMod.default
          ]
        ]
  
  @js.native
  object Uniform
    extends TopLevel[
          Instantiable3[
            /* width */ Double, 
            /* height */ Double, 
            /* options */ Partial[typings.rotJs.uniformMod.Options], 
            typings.rotJs.uniformMod.default
          ]
        ]
  
}

