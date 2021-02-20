package typings.riotGamesApi.RiotGamesAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * lol-status-v1.0
  */
object LolStatus {
  
  @js.native
  trait Incident extends StObject {
    
    var active: Boolean = js.native
    
    var created_at: String = js.native
    
    var id: Double = js.native
    
    var updates: js.Array[Message] = js.native
  }
  object Incident {
    
    @scala.inline
    def apply(active: Boolean, created_at: String, id: Double, updates: js.Array[Message]): Incident = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updates = updates.asInstanceOf[js.Any])
      __obj.asInstanceOf[Incident]
    }
    
    @scala.inline
    implicit class IncidentMutableBuilder[Self <: Incident] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdates(value: js.Array[Message]): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatesVarargs(value: Message*): Self = StObject.set(x, "updates", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Message extends StObject {
    
    var author: String = js.native
    
    var content: String = js.native
    
    var created_at: String = js.native
    
    var id: Double = js.native
    
    var severity: String = js.native
    
    var translations: js.Array[Translation] = js.native
    
    var updated_at: String = js.native
  }
  object Message {
    
    @scala.inline
    def apply(
      author: String,
      content: String,
      created_at: String,
      id: Double,
      severity: String,
      translations: js.Array[Translation],
      updated_at: String
    ): Message = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslations(value: js.Array[Translation]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsVarargs(value: Translation*): Self = StObject.set(x, "translations", js.Array(value :_*))
      
      @scala.inline
      def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Service extends StObject {
    
    var incidents: js.Array[Incident] = js.native
    
    var name: String = js.native
    
    var slug: String = js.native
    
    var status: String = js.native
  }
  object Service {
    
    @scala.inline
    def apply(incidents: js.Array[Incident], name: String, slug: String, status: String): Service = {
      val __obj = js.Dynamic.literal(incidents = incidents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Service]
    }
    
    @scala.inline
    implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncidents(value: js.Array[Incident]): Self = StObject.set(x, "incidents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncidentsVarargs(value: Incident*): Self = StObject.set(x, "incidents", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Shard extends StObject {
    
    var hostname: String = js.native
    
    var locales: js.Array[String] = js.native
    
    var name: String = js.native
    
    var region_tag: String = js.native
    
    var slug: String = js.native
  }
  object Shard {
    
    @scala.inline
    def apply(hostname: String, locales: js.Array[String], name: String, region_tag: String, slug: String): Shard = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], locales = locales.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], region_tag = region_tag.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shard]
    }
    
    @scala.inline
    implicit class ShardMutableBuilder[Self <: Shard] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion_tag(value: String): Self = StObject.set(x, "region_tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ShardStatus extends StObject {
    
    var hostname: String = js.native
    
    var locales: js.Array[String] = js.native
    
    var name: String = js.native
    
    var region_tag: String = js.native
    
    var services: js.Array[Service] = js.native
    
    var slug: String = js.native
  }
  object ShardStatus {
    
    @scala.inline
    def apply(
      hostname: String,
      locales: js.Array[String],
      name: String,
      region_tag: String,
      services: js.Array[Service],
      slug: String
    ): ShardStatus = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], locales = locales.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], region_tag = region_tag.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShardStatus]
    }
    
    @scala.inline
    implicit class ShardStatusMutableBuilder[Self <: ShardStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion_tag(value: String): Self = StObject.set(x, "region_tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServices(value: js.Array[Service]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicesVarargs(value: Service*): Self = StObject.set(x, "services", js.Array(value :_*))
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Translation extends StObject {
    
    var content: String = js.native
    
    var locale: String = js.native
    
    var updated_at: String = js.native
  }
  object Translation {
    
    @scala.inline
    def apply(content: String, locale: String, updated_at: String): Translation = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
      __obj.asInstanceOf[Translation]
    }
    
    @scala.inline
    implicit class TranslationMutableBuilder[Self <: Translation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    }
  }
}
