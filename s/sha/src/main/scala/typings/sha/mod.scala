package typings.sha

import typings.node.streamMod.Transform
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sha", "check")
  @js.native
  def check[R](fileName: String, expected: String, cb: CheckCallback[R]): Unit | R = js.native
  @JSImport("sha", "check")
  @js.native
  def check[R](fileName: String, expected: String, options: ShaOptions, cb: CheckCallback[R]): Unit | R = js.native
  
  @JSImport("sha", "checkSync")
  @js.native
  def checkSync(fileName: String, expected: String): Unit = js.native
  @JSImport("sha", "checkSync")
  @js.native
  def checkSync(fileName: String, expected: String, options: ShaOptions): Unit = js.native
  
  @JSImport("sha", "get")
  @js.native
  def get(fileName: String, cb: GetCallback): Unit = js.native
  @JSImport("sha", "get")
  @js.native
  def get(fileName: String, options: ShaOptions, cb: GetCallback): Unit = js.native
  
  @JSImport("sha", "getSync")
  @js.native
  def getSync(fileName: String): String = js.native
  @JSImport("sha", "getSync")
  @js.native
  def getSync(fileName: String, options: ShaOptions): String = js.native
  
  @JSImport("sha", "stream")
  @js.native
  def stream(expected: String): Transform = js.native
  @JSImport("sha", "stream")
  @js.native
  def stream(expected: String, options: ShaOptions): Transform = js.native
  
  type CheckCallback[R] = js.Function1[/* err */ Error | Null, R]
  
  type GetCallback = js.Function2[/* err */ Error | Null, /* actual */ String, Unit]
  
  @js.native
  trait ShaOptions extends StObject {
    
    /** defaults to `sha1` and can be any of the algorithms supported by `crypto.createHash` */
    var algorithm: js.UndefOr[String] = js.native
  }
  object ShaOptions {
    
    @scala.inline
    def apply(): ShaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShaOptions]
    }
    
    @scala.inline
    implicit class ShaOptionsMutableBuilder[Self <: ShaOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    }
  }
}
