package typings.reactNativeCommunityCliClean

import typings.reactNativeCommunityCliClean.buildCleanMod.Args
import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Default extends StObject {
    
    var default: Unit
    
    var description: String
    
    var name: String
  }
  object Default {
    
    inline def apply(default: Unit, description: String, name: String): Default = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Description extends StObject {
    
    var default: String
    
    var description: String
    
    var name: String
  }
  object Description {
    
    inline def apply(default: String, description: String, name: String): Description = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Func extends StObject {
    
    var description: String
    
    def func(_argv: js.Array[String], _config: Config, cleanOptions: Args): js.Promise[Unit]
    @JSName("func")
    var func_Original: js.Function3[
        /* _argv */ js.Array[String], 
        /* _config */ Config, 
        /* cleanOptions */ Args, 
        js.Promise[Unit]
      ]
    
    var name: String
    
    var options: js.Array[Default | Description | Name]
  }
  object Func {
    
    inline def apply(
      description: String,
      func: (/* _argv */ js.Array[String], /* _config */ Config, /* cleanOptions */ Args) => js.Promise[Unit],
      name: String,
      options: js.Array[Default | Description | Name]
    ): Func = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], func = js.Any.fromFunction3(func), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Func]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Func] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setFunc(
        value: (/* _argv */ js.Array[String], /* _config */ Config, /* cleanOptions */ Args) => js.Promise[Unit]
      ): Self = StObject.set(x, "func", js.Any.fromFunction3(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Array[Default | Description | Name]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: (Default | Description | Name)*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
  
  trait Name extends StObject {
    
    var default: Boolean
    
    var description: String
    
    var name: String
  }
  object Name {
    
    inline def apply(default: Boolean, description: String, name: String): Name = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
