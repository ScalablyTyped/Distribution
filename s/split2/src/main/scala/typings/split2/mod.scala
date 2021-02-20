package typings.split2

import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("split2", JSImport.Namespace)
  @js.native
  def apply(): Transform = js.native
  @JSImport("split2", JSImport.Namespace)
  @js.native
  def apply(mapper: Mapper): Transform = js.native
  @JSImport("split2", JSImport.Namespace)
  @js.native
  def apply(mapper: Mapper, options: Options): Transform = js.native
  @JSImport("split2", JSImport.Namespace)
  @js.native
  def apply(matcher: Matcher): Transform = js.native
  @JSImport("split2", JSImport.Namespace)
  @js.native
  def apply(matcher: Matcher, mapper: Mapper): Transform = js.native
  @JSImport("split2", JSImport.Namespace)
  @js.native
  def apply(matcher: Matcher, mapper: Mapper, options: Options): Transform = js.native
  @JSImport("split2", JSImport.Namespace)
  @js.native
  def apply(matcher: Matcher, options: Options): Transform = js.native
  @JSImport("split2", JSImport.Namespace)
  @js.native
  def apply(options: Options): Transform = js.native
  
  type Mapper = js.Function1[/* line */ String, js.Any]
  
  type Matcher = String | RegExp
  
  @js.native
  trait Options extends TransformOptions {
    
    var maxLength: js.UndefOr[Double] = js.native
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
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    }
  }
}
