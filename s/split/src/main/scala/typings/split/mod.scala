package typings.split

import typings.through.mod.ThroughStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("split", JSImport.Namespace)
  @js.native
  def apply(): ThroughStream = js.native
  @JSImport("split", JSImport.Namespace)
  @js.native
  def apply(matcher: js.UndefOr[scala.Nothing], mapper: js.UndefOr[scala.Nothing], options: SplitOptions): ThroughStream = js.native
  @JSImport("split", JSImport.Namespace)
  @js.native
  def apply(matcher: js.UndefOr[scala.Nothing], mapper: js.Any): ThroughStream = js.native
  @JSImport("split", JSImport.Namespace)
  @js.native
  def apply(matcher: js.UndefOr[scala.Nothing], mapper: js.Any, options: SplitOptions): ThroughStream = js.native
  @JSImport("split", JSImport.Namespace)
  @js.native
  def apply(matcher: js.Any): ThroughStream = js.native
  @JSImport("split", JSImport.Namespace)
  @js.native
  def apply(matcher: js.Any, mapper: js.UndefOr[scala.Nothing], options: SplitOptions): ThroughStream = js.native
  @JSImport("split", JSImport.Namespace)
  @js.native
  def apply(matcher: js.Any, mapper: js.Any): ThroughStream = js.native
  @JSImport("split", JSImport.Namespace)
  @js.native
  def apply(matcher: js.Any, mapper: js.Any, options: SplitOptions): ThroughStream = js.native
  
  @js.native
  trait SplitOptions extends StObject {
    
    var maxLength: Double = js.native
  }
  object SplitOptions {
    
    @scala.inline
    def apply(maxLength: Double): SplitOptions = {
      val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplitOptions]
    }
    
    @scala.inline
    implicit class SplitOptionsMutableBuilder[Self <: SplitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    }
  }
}
