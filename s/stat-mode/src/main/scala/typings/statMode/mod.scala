package typings.statMode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Mode = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Mode]
  inline def apply(stat: Double): Mode = ^.asInstanceOf[js.Dynamic].apply(stat.asInstanceOf[js.Any]).asInstanceOf[Mode]
  inline def apply(stat: StatsMode): Mode = ^.asInstanceOf[js.Dynamic].apply(stat.asInstanceOf[js.Any]).asInstanceOf[Mode]
  
  @JSImport("stat-mode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("stat-mode", "Group")
  @js.native
  open class Group protected () extends RWX {
    def this(stat: StatsMode) = this()
  }
  object Group {
    
    @JSImport("stat-mode", "Group")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("stat-mode", "Group.r")
    @js.native
    def r: Double = js.native
    inline def r_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("r")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("stat-mode", "Group.w")
    @js.native
    def w: Double = js.native
    inline def w_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("w")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("stat-mode", "Group.x")
    @js.native
    def x: Double = js.native
    inline def x_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("stat-mode", "Mode")
  @js.native
  open class Mode () extends StObject {
    def this(stat: Double) = this()
    def this(stat: StatsMode) = this()
    
    /* private */ var checkModeProperty: Any = js.native
    
    var group: Group = js.native
    
    def isBlockDevice(): Boolean = js.native
    def isBlockDevice(v: Boolean): Boolean = js.native
    
    def isCharacterDevice(): Boolean = js.native
    def isCharacterDevice(v: Boolean): Boolean = js.native
    
    def isDirectory(): Boolean = js.native
    def isDirectory(v: Boolean): Boolean = js.native
    
    def isFIFO(): Boolean = js.native
    def isFIFO(v: Boolean): Boolean = js.native
    
    def isFile(): Boolean = js.native
    def isFile(v: Boolean): Boolean = js.native
    
    def isSocket(): Boolean = js.native
    def isSocket(v: Boolean): Boolean = js.native
    
    def isSymbolicLink(): Boolean = js.native
    def isSymbolicLink(v: Boolean): Boolean = js.native
    
    var others: Others = js.native
    
    var owner: Owner = js.native
    
    def setgid: Boolean = js.native
    def setgid_=(v: Boolean): Unit = js.native
    
    def setuid: Boolean = js.native
    def setuid_=(v: Boolean): Unit = js.native
    
    /* private */ var stat: Any = js.native
    
    def sticky: Boolean = js.native
    def sticky_=(v: Boolean): Unit = js.native
    
    /**
      * Returns an octal representation of the `mode`, eg. "0754".
      *
      * http://en.wikipedia.org/wiki/File_system_permissions#Numeric_notation
      *
      * @return {String}
      * @api public
      */
    def toOctal(): String = js.native
  }
  
  @JSImport("stat-mode", "Others")
  @js.native
  open class Others protected () extends RWX {
    def this(stat: StatsMode) = this()
  }
  object Others {
    
    @JSImport("stat-mode", "Others")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("stat-mode", "Others.r")
    @js.native
    def r: Double = js.native
    inline def r_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("r")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("stat-mode", "Others.w")
    @js.native
    def w: Double = js.native
    inline def w_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("w")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("stat-mode", "Others.x")
    @js.native
    def x: Double = js.native
    inline def x_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("stat-mode", "Owner")
  @js.native
  open class Owner protected () extends RWX {
    def this(stat: StatsMode) = this()
  }
  object Owner {
    
    @JSImport("stat-mode", "Owner")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("stat-mode", "Owner.r")
    @js.native
    def r: Double = js.native
    inline def r_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("r")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("stat-mode", "Owner.w")
    @js.native
    def w: Double = js.native
    inline def w_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("w")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("stat-mode", "Owner.x")
    @js.native
    def x: Double = js.native
    inline def x_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("stat-mode", "RWX")
  @js.native
  open class RWX protected () extends StObject {
    def this(stat: StatsMode) = this()
    
    def execute: Boolean = js.native
    def execute_=(v: Boolean): Unit = js.native
    
    def read: Boolean = js.native
    def read_=(v: Boolean): Unit = js.native
    
    /* private */ var stat: Any = js.native
    
    def write: Boolean = js.native
    def write_=(v: Boolean): Unit = js.native
  }
  object RWX {
    
    @JSImport("stat-mode", "RWX")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("stat-mode", "RWX.r")
    @js.native
    def r: Double = js.native
    inline def r_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("r")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("stat-mode", "RWX.w")
    @js.native
    def w: Double = js.native
    inline def w_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("w")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("stat-mode", "RWX.x")
    @js.native
    def x: Double = js.native
    inline def x_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x")(x.asInstanceOf[js.Any])
  }
  
  inline def isStatsMode(v: Any): /* is stat-mode.stat-mode.StatsMode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStatsMode")(v.asInstanceOf[js.Any]).asInstanceOf[/* is stat-mode.stat-mode.StatsMode */ Boolean]
  
  /* Inlined std.Pick<node.fs.Stats, 'mode'> */
  trait StatsMode extends StObject {
    
    var mode: Double
  }
  object StatsMode {
    
    inline def apply(mode: Double): StatsMode = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatsMode]
    }
    
    extension [Self <: StatsMode](x: Self) {
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
}
