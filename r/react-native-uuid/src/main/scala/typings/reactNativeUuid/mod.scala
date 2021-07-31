package typings.reactNativeUuid

import org.scalablytyped.runtime.Shortcut
import typings.std.ArrayBuffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-uuid", JSImport.Namespace)
  @js.native
  val ^ : uuid = js.native
  
  type _To = uuid
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: uuid = ^
  
  @js.native
  trait uuid extends StObject {
    
    def noConflict(): String = js.native
    
    def parse(id: String): ArrayBuffer = js.native
    def parse(id: String, buffer: Unit, offset: Double): ArrayBuffer = js.native
    def parse(id: String, buffer: ArrayBuffer): ArrayBuffer = js.native
    def parse(id: String, buffer: ArrayBuffer, offset: Double): ArrayBuffer = js.native
    
    def unparse(): String = js.native
    def unparse(buffer: Unit, offset: Double): String = js.native
    def unparse(buffer: ArrayBuffer): String = js.native
    def unparse(buffer: ArrayBuffer, offset: Double): String = js.native
    
    def v1(): String = js.native
    def v1(options: Unit, buffer: Unit, offset: Double): String = js.native
    def v1(options: Unit, buffer: ArrayBuffer): String = js.native
    def v1(options: Unit, buffer: ArrayBuffer, offset: Double): String = js.native
    def v1(options: typings.reactNativeUuid.mod.v1): String = js.native
    def v1(options: typings.reactNativeUuid.mod.v1, buffer: Unit, offset: Double): String = js.native
    def v1(options: typings.reactNativeUuid.mod.v1, buffer: ArrayBuffer): String = js.native
    def v1(options: typings.reactNativeUuid.mod.v1, buffer: ArrayBuffer, offset: Double): String = js.native
    
    def v4(): String = js.native
    def v4(options: Unit, buffer: Unit, offset: Double): String = js.native
    def v4(options: Unit, buffer: ArrayBuffer): String = js.native
    def v4(options: Unit, buffer: ArrayBuffer, offset: Double): String = js.native
    def v4(options: typings.reactNativeUuid.mod.v4): String = js.native
    def v4(options: typings.reactNativeUuid.mod.v4, buffer: Unit, offset: Double): String = js.native
    def v4(options: typings.reactNativeUuid.mod.v4, buffer: ArrayBuffer): String = js.native
    def v4(options: typings.reactNativeUuid.mod.v4, buffer: ArrayBuffer, offset: Double): String = js.native
  }
  
  trait v1 extends StObject {
    
    var clockseq: Double
    
    var msecs: Double | Date
    
    var node: js.Array[Double]
    
    var nsecs: Double
  }
  object v1 {
    
    @scala.inline
    def apply(clockseq: Double, msecs: Double | Date, node: js.Array[Double], nsecs: Double): v1 = {
      val __obj = js.Dynamic.literal(clockseq = clockseq.asInstanceOf[js.Any], msecs = msecs.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nsecs = nsecs.asInstanceOf[js.Any])
      __obj.asInstanceOf[v1]
    }
    
    @scala.inline
    implicit class v1MutableBuilder[Self <: v1] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClockseq(value: Double): Self = StObject.set(x, "clockseq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsecs(value: Double | Date): Self = StObject.set(x, "msecs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: js.Array[Double]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeVarargs(value: Double*): Self = StObject.set(x, "node", js.Array(value :_*))
      
      @scala.inline
      def setNsecs(value: Double): Self = StObject.set(x, "nsecs", value.asInstanceOf[js.Any])
    }
  }
  
  trait v4 extends StObject {
    
    var random: js.UndefOr[js.Array[Double]] = js.undefined
    
    var rng: js.UndefOr[js.Function1[/* args */ js.Any, Unit]] = js.undefined
  }
  object v4 {
    
    @scala.inline
    def apply(): v4 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[v4]
    }
    
    @scala.inline
    implicit class v4MutableBuilder[Self <: v4] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRandom(value: js.Array[Double]): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
      
      @scala.inline
      def setRandomVarargs(value: Double*): Self = StObject.set(x, "random", js.Array(value :_*))
      
      @scala.inline
      def setRng(value: /* args */ js.Any => Unit): Self = StObject.set(x, "rng", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRngUndefined: Self = StObject.set(x, "rng", js.undefined)
    }
  }
}
