package typings.sisteransi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sisteransi", "beep")
  @js.native
  val beep: String = js.native
  
  @JSImport("sisteransi", "clear")
  @js.native
  val clear: String = js.native
  
  object cursor {
    
    @JSImport("sisteransi", "cursor.backward")
    @js.native
    def backward(): String = js.native
    @JSImport("sisteransi", "cursor.backward")
    @js.native
    def backward(count: Double): String = js.native
    
    @JSImport("sisteransi", "cursor.down")
    @js.native
    def down(): String = js.native
    @JSImport("sisteransi", "cursor.down")
    @js.native
    def down(count: Double): String = js.native
    
    @JSImport("sisteransi", "cursor.forward")
    @js.native
    def forward(): String = js.native
    @JSImport("sisteransi", "cursor.forward")
    @js.native
    def forward(count: Double): String = js.native
    
    @JSImport("sisteransi", "cursor.hide")
    @js.native
    val hide: String = js.native
    
    @JSImport("sisteransi", "cursor.left")
    @js.native
    val left: String = js.native
    
    @JSImport("sisteransi", "cursor.move")
    @js.native
    def move(x: Double, y: Double): String = js.native
    
    @JSImport("sisteransi", "cursor.nextLine")
    @js.native
    def nextLine(): String = js.native
    @JSImport("sisteransi", "cursor.nextLine")
    @js.native
    def nextLine(count: Double): String = js.native
    
    @JSImport("sisteransi", "cursor.prevLine")
    @js.native
    def prevLine(): String = js.native
    @JSImport("sisteransi", "cursor.prevLine")
    @js.native
    def prevLine(count: Double): String = js.native
    
    @JSImport("sisteransi", "cursor.restore")
    @js.native
    val restore: String = js.native
    
    @JSImport("sisteransi", "cursor.save")
    @js.native
    val save: String = js.native
    
    @JSImport("sisteransi", "cursor.show")
    @js.native
    val show: String = js.native
    
    @JSImport("sisteransi", "cursor.to")
    @js.native
    def to(x: Double): String = js.native
    @JSImport("sisteransi", "cursor.to")
    @js.native
    def to(x: Double, y: Double): String = js.native
    
    @JSImport("sisteransi", "cursor.up")
    @js.native
    def up(): String = js.native
    @JSImport("sisteransi", "cursor.up")
    @js.native
    def up(count: Double): String = js.native
  }
  
  object erase {
    
    @JSImport("sisteransi", "erase.down")
    @js.native
    def down(): String = js.native
    @JSImport("sisteransi", "erase.down")
    @js.native
    def down(count: Double): String = js.native
    
    @JSImport("sisteransi", "erase.line")
    @js.native
    val line: String = js.native
    
    @JSImport("sisteransi", "erase.lineEnd")
    @js.native
    val lineEnd: String = js.native
    
    @JSImport("sisteransi", "erase.lineStart")
    @js.native
    val lineStart: String = js.native
    
    @JSImport("sisteransi", "erase.lines")
    @js.native
    def lines(count: Double): String = js.native
    
    @JSImport("sisteransi", "erase.screen")
    @js.native
    val screen: String = js.native
    
    @JSImport("sisteransi", "erase.up")
    @js.native
    def up(): String = js.native
    @JSImport("sisteransi", "erase.up")
    @js.native
    def up(count: Double): String = js.native
  }
  
  object scroll {
    
    @JSImport("sisteransi", "scroll.down")
    @js.native
    def down(): String = js.native
    @JSImport("sisteransi", "scroll.down")
    @js.native
    def down(count: Double): String = js.native
    
    @JSImport("sisteransi", "scroll.up")
    @js.native
    def up(): String = js.native
    @JSImport("sisteransi", "scroll.up")
    @js.native
    def up(count: Double): String = js.native
  }
}
