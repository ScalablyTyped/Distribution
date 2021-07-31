package typings.sha

import typings.node.streamMod.Transform
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sha", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def check[R](fileName: String, expected: String, cb: CheckCallback[R]): Unit | R = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fileName.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit | R]
  @scala.inline
  def check[R](fileName: String, expected: String, options: ShaOptions, cb: CheckCallback[R]): Unit | R = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fileName.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit | R]
  
  @scala.inline
  def checkSync(fileName: String, expected: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkSync")(fileName.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def checkSync(fileName: String, expected: String, options: ShaOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkSync")(fileName.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def get(fileName: String, cb: GetCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(fileName.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def get(fileName: String, options: ShaOptions, cb: GetCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(fileName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getSync(fileName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSync")(fileName.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getSync(fileName: String, options: ShaOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSync")(fileName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def stream(expected: String): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(expected.asInstanceOf[js.Any]).asInstanceOf[Transform]
  @scala.inline
  def stream(expected: String, options: ShaOptions): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transform]
  
  type CheckCallback[R] = js.Function1[/* err */ Error | Null, R]
  
  type GetCallback = js.Function2[/* err */ Error | Null, /* actual */ String, Unit]
  
  trait ShaOptions extends StObject {
    
    /** defaults to `sha1` and can be any of the algorithms supported by `crypto.createHash` */
    var algorithm: js.UndefOr[String] = js.undefined
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
