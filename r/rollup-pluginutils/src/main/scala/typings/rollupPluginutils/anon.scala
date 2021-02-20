package typings.rollupPluginutils

import typings.rollupPluginutils.rollupPluginutilsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Resolve extends StObject {
    
    var resolve: js.UndefOr[String | `false` | Null] = js.native
  }
  object Resolve {
    
    @scala.inline
    def apply(): Resolve = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Resolve]
    }
    
    @scala.inline
    implicit class ResolveMutableBuilder[Self <: Resolve] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResolve(value: String | `false`): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveNull: Self = StObject.set(x, "resolve", null)
      
      @scala.inline
      def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    }
  }
}
