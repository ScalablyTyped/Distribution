package typings.rotJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.rotJs.anon.PartialOptionsBorn
import typings.rotJs.anon.PartialOptionsCellHeight
import typings.rotJs.anon.PartialOptionsCorridorLength
import typings.rotJs.anon.PartialOptionsRoomDugPercentage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMapMod {
  
  object default {
    
    @JSImport("rot-js/lib/map", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js/lib/map", "default.Arena")
    @js.native
    open class Arena ()
      extends typings.rotJs.libMapArenaMod.default
    @JSImport("rot-js/lib/map", "default.Arena")
    @js.native
    def Arena: Instantiable0[typings.rotJs.libMapArenaMod.default] = js.native
    inline def Arena_=(x: Instantiable0[typings.rotJs.libMapArenaMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Arena")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js/lib/map", "default.Cellular")
    @js.native
    open class Cellular protected ()
      extends typings.rotJs.libMapCellularMod.default {
      def this(width: Double, height: Double) = this()
      def this(width: Double, height: Double, options: PartialOptionsBorn) = this()
    }
    @JSImport("rot-js/lib/map", "default.Cellular")
    @js.native
    def Cellular: Instantiable3[
        /* width */ Double, 
        /* height */ Double, 
        /* options */ js.UndefOr[PartialOptionsBorn], 
        typings.rotJs.libMapCellularMod.default
      ] = js.native
    inline def Cellular_=(
      x: Instantiable3[
          /* width */ Double, 
          /* height */ Double, 
          /* options */ js.UndefOr[PartialOptionsBorn], 
          typings.rotJs.libMapCellularMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cellular")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js/lib/map", "default.Digger")
    @js.native
    open class Digger protected ()
      extends typings.rotJs.libMapDiggerMod.default {
      def this(width: Double, height: Double) = this()
      def this(width: Double, height: Double, options: PartialOptionsCorridorLength) = this()
    }
    @JSImport("rot-js/lib/map", "default.Digger")
    @js.native
    def Digger: Instantiable3[
        /* width */ Double, 
        /* height */ Double, 
        /* options */ js.UndefOr[PartialOptionsCorridorLength], 
        typings.rotJs.libMapDiggerMod.default
      ] = js.native
    inline def Digger_=(
      x: Instantiable3[
          /* width */ Double, 
          /* height */ Double, 
          /* options */ js.UndefOr[PartialOptionsCorridorLength], 
          typings.rotJs.libMapDiggerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Digger")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js/lib/map", "default.DividedMaze")
    @js.native
    open class DividedMaze ()
      extends typings.rotJs.libMapDividedmazeMod.default
    @JSImport("rot-js/lib/map", "default.DividedMaze")
    @js.native
    def DividedMaze: Instantiable0[typings.rotJs.libMapDividedmazeMod.default] = js.native
    inline def DividedMaze_=(x: Instantiable0[typings.rotJs.libMapDividedmazeMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DividedMaze")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js/lib/map", "default.EllerMaze")
    @js.native
    open class EllerMaze ()
      extends typings.rotJs.libMapEllermazeMod.default
    @JSImport("rot-js/lib/map", "default.EllerMaze")
    @js.native
    def EllerMaze: Instantiable0[typings.rotJs.libMapEllermazeMod.default] = js.native
    inline def EllerMaze_=(x: Instantiable0[typings.rotJs.libMapEllermazeMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EllerMaze")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js/lib/map", "default.IceyMaze")
    @js.native
    open class IceyMaze protected ()
      extends typings.rotJs.libMapIceymazeMod.default {
      def this(width: Double, height: Double) = this()
      def this(width: Double, height: Double, regularity: Double) = this()
    }
    @JSImport("rot-js/lib/map", "default.IceyMaze")
    @js.native
    def IceyMaze: Instantiable3[
        /* width */ Double, 
        /* height */ Double, 
        /* regularity */ js.UndefOr[Double], 
        typings.rotJs.libMapIceymazeMod.default
      ] = js.native
    inline def IceyMaze_=(
      x: Instantiable3[
          /* width */ Double, 
          /* height */ Double, 
          /* regularity */ js.UndefOr[Double], 
          typings.rotJs.libMapIceymazeMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IceyMaze")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js/lib/map", "default.Rogue")
    @js.native
    open class Rogue protected ()
      extends typings.rotJs.libMapRogueMod.default {
      def this(width: Double, height: Double, options: PartialOptionsCellHeight) = this()
    }
    @JSImport("rot-js/lib/map", "default.Rogue")
    @js.native
    def Rogue: Instantiable3[
        /* width */ Double, 
        /* height */ Double, 
        /* options */ PartialOptionsCellHeight, 
        typings.rotJs.libMapRogueMod.default
      ] = js.native
    inline def Rogue_=(
      x: Instantiable3[
          /* width */ Double, 
          /* height */ Double, 
          /* options */ PartialOptionsCellHeight, 
          typings.rotJs.libMapRogueMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rogue")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js/lib/map", "default.Uniform")
    @js.native
    open class Uniform protected ()
      extends typings.rotJs.libMapUniformMod.default {
      def this(width: Double, height: Double, options: PartialOptionsRoomDugPercentage) = this()
    }
    @JSImport("rot-js/lib/map", "default.Uniform")
    @js.native
    def Uniform: Instantiable3[
        /* width */ Double, 
        /* height */ Double, 
        /* options */ PartialOptionsRoomDugPercentage, 
        typings.rotJs.libMapUniformMod.default
      ] = js.native
    inline def Uniform_=(
      x: Instantiable3[
          /* width */ Double, 
          /* height */ Double, 
          /* options */ PartialOptionsRoomDugPercentage, 
          typings.rotJs.libMapUniformMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Uniform")(x.asInstanceOf[js.Any])
  }
}
