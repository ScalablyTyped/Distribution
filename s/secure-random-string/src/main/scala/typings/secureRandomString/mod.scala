package typings.secureRandomString

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  @scala.inline
  def apply(cb: Callback): Unit = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(options: Options): String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(options: Options, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("secure-random-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[String], Unit]
  
  trait Options extends StObject {
    
    var alphanumeric: js.UndefOr[Boolean] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlphanumeric(value: Boolean): Self = StObject.set(x, "alphanumeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphanumericUndefined: Self = StObject.set(x, "alphanumeric", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    }
  }
}
