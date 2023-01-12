package typings.proto3JsonSerializer

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var value: String | Double | Boolean
  }
  object `0` {
    
    inline def apply(value: String | Double | Boolean): `0` = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Paths extends StObject {
    
    var paths: js.Array[String]
  }
  object Paths {
    
    inline def apply(paths: js.Array[String]): Paths = {
      val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[Paths]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Paths] (val x: Self) extends AnyVal {
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    }
  }
  
  trait Typeurl extends StObject {
    
    var type_url: String
    
    var value: Null
  }
  object Typeurl {
    
    inline def apply(type_url: String, value: Null): Typeurl = {
      val __obj = js.Dynamic.literal(type_url = type_url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeurl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Typeurl] (val x: Self) extends AnyVal {
      
      inline def setType_url(value: String): Self = StObject.set(x, "type_url", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Null): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var type_url: String
    
    var value: String
  }
  object Value {
    
    inline def apply(type_url: String, value: String): Value = {
      val __obj = js.Dynamic.literal(type_url = type_url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      inline def setType_url(value: String): Self = StObject.set(x, "type_url", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueBuffer extends StObject {
    
    var value: Buffer
  }
  object ValueBuffer {
    
    inline def apply(value: Buffer): ValueBuffer = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueBuffer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueBuffer] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueNull extends StObject {
    
    var value: Null
  }
  object ValueNull {
    
    inline def apply(value: Null): ValueNull = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueNull]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueNull] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Null): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
