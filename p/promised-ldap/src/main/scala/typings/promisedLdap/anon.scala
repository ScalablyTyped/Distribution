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
    
    @scala.inline
    def apply(email: String, groups: js.Array[String], name: String): Email = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Entries extends StObject {
    
    var entries: js.Array[js.Any]
    
    var references: js.Array[js.Any]
  }
  object Entries {
    
    @scala.inline
    def apply(entries: js.Array[js.Any], references: js.Array[js.Any]): Entries = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entries]
    }
    
    @scala.inline
    implicit class EntriesMutableBuilder[Self <: Entries] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntries(value: js.Array[js.Any]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntriesVarargs(value: js.Any*): Self = StObject.set(x, "entries", js.Array(value :_*))
      
      @scala.inline
      def setReferences(value: js.Array[js.Any]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencesVarargs(value: js.Any*): Self = StObject.set(x, "references", js.Array(value :_*))
    }
  }
  
  trait Url extends StObject {
    
    var url: String
  }
  object Url {
    
    @scala.inline
    def apply(url: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
