package typings.reactNativeCommunityCliHermes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cmd extends StObject {
    
    var cmd: String
    
    var desc: String
  }
  object Cmd {
    
    inline def apply(cmd: String, desc: String): Cmd = {
      val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cmd]
    }
    
    extension [Self <: Cmd](x: Self) {
      
      inline def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    }
  }
  
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
    
    extension [Self <: Default](x: Self) {
      
      inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Description extends StObject {
    
    var default: String
    
    var description: Unit
    
    var name: String
  }
  object Description {
    
    inline def apply(default: String, description: Unit, name: String): Description = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    extension [Self <: Description](x: Self) {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: Unit): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
