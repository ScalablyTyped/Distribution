package typings.prosemirrorTransform

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorTransform.mod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attrs[S /* <: Schema[js.Any, js.Any] */] extends StObject {
    
    var attrs: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
    
    var `type`: NodeType[S]
  }
  object Attrs {
    
    @scala.inline
    def apply[S /* <: Schema[js.Any, js.Any] */](`type`: NodeType[S]): Attrs[S] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attrs[S]]
    }
    
    @scala.inline
    implicit class AttrsMutableBuilder[Self <: Attrs[?], S /* <: Schema[js.Any, js.Any] */] (val x: Self & Attrs[S]) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: StringDictionary[js.Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsNull: Self = StObject.set(x, "attrs", null)
      
      @scala.inline
      def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      @scala.inline
      def setType(value: NodeType[S]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* args (repeated) */ js.Any, Step[js.Any]]
}
