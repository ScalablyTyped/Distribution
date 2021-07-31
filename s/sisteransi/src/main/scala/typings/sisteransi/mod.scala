package typings.sisteransi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sisteransi", "beep")
  @js.native
  val beep: String = js.native
  
  @JSImport("sisteransi", "clear")
  @js.native
  val clear: String = js.native
  
  object cursor {
    
    @JSImport("sisteransi", "cursor")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def backward(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("backward")().asInstanceOf[String]
    @scala.inline
    def backward(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("backward")(count.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def down(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("down")().asInstanceOf[String]
    @scala.inline
    def down(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("down")(count.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def forward(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("forward")().asInstanceOf[String]
    @scala.inline
    def forward(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("forward")(count.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("sisteransi", "cursor.hide")
    @js.native
    val hide: String = js.native
    
    @JSImport("sisteransi", "cursor.left")
    @js.native
    val left: String = js.native
    
    @scala.inline
    def move(x: Double, y: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def nextLine(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nextLine")().asInstanceOf[String]
    @scala.inline
    def nextLine(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nextLine")(count.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def prevLine(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prevLine")().asInstanceOf[String]
    @scala.inline
    def prevLine(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prevLine")(count.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("sisteransi", "cursor.restore")
    @js.native
    val restore: String = js.native
    
    @JSImport("sisteransi", "cursor.save")
    @js.native
    val save: String = js.native
    
    @JSImport("sisteransi", "cursor.show")
    @js.native
    val show: String = js.native
    
    @scala.inline
    def to(x: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("to")(x.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def to(x: Double, y: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("to")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def up(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("up")().asInstanceOf[String]
    @scala.inline
    def up(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("up")(count.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object erase {
    
    @JSImport("sisteransi", "erase")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def down(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("down")().asInstanceOf[String]
    @scala.inline
    def down(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("down")(count.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("sisteransi", "erase.line")
    @js.native
    val line: String = js.native
    
    @JSImport("sisteransi", "erase.lineEnd")
    @js.native
    val lineEnd: String = js.native
    
    @JSImport("sisteransi", "erase.lineStart")
    @js.native
    val lineStart: String = js.native
    
    @scala.inline
    def lines(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lines")(count.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("sisteransi", "erase.screen")
    @js.native
    val screen: String = js.native
    
    @scala.inline
    def up(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("up")().asInstanceOf[String]
    @scala.inline
    def up(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("up")(count.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object scroll {
    
    @JSImport("sisteransi", "scroll")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def down(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("down")().asInstanceOf[String]
    @scala.inline
    def down(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("down")(count.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def up(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("up")().asInstanceOf[String]
    @scala.inline
    def up(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("up")(count.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
