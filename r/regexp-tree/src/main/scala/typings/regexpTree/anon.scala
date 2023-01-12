package typings.regexpTree

import typings.regexpTree.astMod.AstNodeLocation
import typings.regexpTree.regexpTreeBooleans.`false`
import typings.regexpTree.regexpTreeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var asNodes: js.UndefOr[`false`] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setAsNodes(value: `false`): Self = StObject.set(x, "asNodes", value.asInstanceOf[js.Any])
      
      inline def setAsNodesUndefined: Self = StObject.set(x, "asNodes", js.undefined)
    }
  }
  
  trait AsNodes extends StObject {
    
    var asNodes: `true`
  }
  object AsNodes {
    
    inline def apply(): AsNodes = {
      val __obj = js.Dynamic.literal(asNodes = true)
      __obj.asInstanceOf[AsNodes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsNodes] (val x: Self) extends AnyVal {
      
      inline def setAsNodes(value: `true`): Self = StObject.set(x, "asNodes", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: AstNodeLocation
    
    var source: String
    
    var start: AstNodeLocation
  }
  object End {
    
    inline def apply(end: AstNodeLocation, source: String, start: AstNodeLocation): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: AstNodeLocation): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStart(value: AstNodeLocation): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Format extends StObject {
    
    var format: js.UndefOr[String | Double] = js.undefined
    
    var useLoc: js.UndefOr[Boolean] = js.undefined
  }
  object Format {
    
    inline def apply(): Format = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: String | Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setUseLoc(value: Boolean): Self = StObject.set(x, "useLoc", value.asInstanceOf[js.Any])
      
      inline def setUseLocUndefined: Self = StObject.set(x, "useLoc", js.undefined)
    }
  }
}
