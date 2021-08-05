package typings.promisedLdap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Email extends StObject {
    
    var email: String
    
    var groups: js.Array[String]
    
    var name: String
  }
  object Email {
    
    inline def apply(email: String, groups: js.Array[String], name: String): Email = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Email]
    }
    
    extension [Self <: Email](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Entries extends StObject {
    
    var entries: js.Array[js.Any]
    
    var references: js.Array[js.Any]
  }
  object Entries {
    
    inline def apply(entries: js.Array[js.Any], references: js.Array[js.Any]): Entries = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entries]
    }
    
    extension [Self <: Entries](x: Self) {
      
      inline def setEntries(value: js.Array[js.Any]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesVarargs(value: js.Any*): Self = StObject.set(x, "entries", js.Array(value :_*))
      
      inline def setReferences(value: js.Array[js.Any]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setReferencesVarargs(value: js.Any*): Self = StObject.set(x, "references", js.Array(value :_*))
    }
  }
  
  trait Url extends StObject {
    
    var url: String
  }
  object Url {
    
    inline def apply(url: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
