package typings.sisteransi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sisteransi", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val beep: String = js.native
  
  val clear: String = js.native
  
  @js.native
  object cursor extends js.Object {
    
    def backward(): String = js.native
    def backward(count: Double): String = js.native
    
    def down(): String = js.native
    def down(count: Double): String = js.native
    
    def forward(): String = js.native
    def forward(count: Double): String = js.native
    
    val hide: String = js.native
    
    val left: String = js.native
    
    def move(x: Double, y: Double): String = js.native
    
    def nextLine(): String = js.native
    def nextLine(count: Double): String = js.native
    
    def prevLine(): String = js.native
    def prevLine(count: Double): String = js.native
    
    val restore: String = js.native
    
    val save: String = js.native
    
    val show: String = js.native
    
    def to(x: Double): String = js.native
    def to(x: Double, y: Double): String = js.native
    
    def up(): String = js.native
    def up(count: Double): String = js.native
  }
  
  @js.native
  object erase extends js.Object {
    
    def down(): String = js.native
    def down(count: Double): String = js.native
    
    val line: String = js.native
    
    val lineEnd: String = js.native
    
    val lineStart: String = js.native
    
    def lines(count: Double): String = js.native
    
    val screen: String = js.native
    
    def up(): String = js.native
    def up(count: Double): String = js.native
  }
  
  @js.native
  object scroll extends js.Object {
    
    def down(): String = js.native
    def down(count: Double): String = js.native
    
    def up(): String = js.native
    def up(count: Double): String = js.native
  }
}
