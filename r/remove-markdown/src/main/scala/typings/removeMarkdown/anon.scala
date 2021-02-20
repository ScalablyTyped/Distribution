package typings.removeMarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Gfm extends StObject {
    
    var gfm: js.UndefOr[Boolean] = js.native
    
    var stripListLeaders: js.UndefOr[Boolean] = js.native
  }
  object Gfm {
    
    @scala.inline
    def apply(): Gfm = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Gfm]
    }
    
    @scala.inline
    implicit class GfmMutableBuilder[Self <: Gfm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGfm(value: Boolean): Self = StObject.set(x, "gfm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGfmUndefined: Self = StObject.set(x, "gfm", js.undefined)
      
      @scala.inline
      def setStripListLeaders(value: Boolean): Self = StObject.set(x, "stripListLeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripListLeadersUndefined: Self = StObject.set(x, "stripListLeaders", js.undefined)
    }
  }
}
