package typings.raygun4js

import typings.raygun4js.mod.BreadcrumbLevel
import typings.raygun4js.mod.RaygunStackTrace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Browser extends StObject {
    
    var Browser: String
    
    var `Browser-Height`: Double
    
    var `Browser-Name`: String
    
    var `Browser-Version`: String
    
    var `Browser-Width`: Double
    
    var `Color-Depth`: Double
    
    var `Document-Mode`: Double
    
    var Platform: String
    
    var `Screen-Height`: Double
    
    var `Screen-Width`: Double
    
    var `User-Language`: String
    
    var UtcOffset: Double
  }
  object Browser {
    
    @scala.inline
    def apply(
      Browser: String,
      `Browser-Height`: Double,
      `Browser-Name`: String,
      `Browser-Version`: String,
      `Browser-Width`: Double,
      `Color-Depth`: Double,
      `Document-Mode`: Double,
      Platform: String,
      `Screen-Height`: Double,
      `Screen-Width`: Double,
      `User-Language`: String,
      UtcOffset: Double
    ): Browser = {
      val __obj = js.Dynamic.literal(Browser = Browser.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any], UtcOffset = UtcOffset.asInstanceOf[js.Any])
      __obj.updateDynamic("Browser-Height")(`Browser-Height`.asInstanceOf[js.Any])
      __obj.updateDynamic("Browser-Name")(`Browser-Name`.asInstanceOf[js.Any])
      __obj.updateDynamic("Browser-Version")(`Browser-Version`.asInstanceOf[js.Any])
      __obj.updateDynamic("Browser-Width")(`Browser-Width`.asInstanceOf[js.Any])
      __obj.updateDynamic("Color-Depth")(`Color-Depth`.asInstanceOf[js.Any])
      __obj.updateDynamic("Document-Mode")(`Document-Mode`.asInstanceOf[js.Any])
      __obj.updateDynamic("Screen-Height")(`Screen-Height`.asInstanceOf[js.Any])
      __obj.updateDynamic("Screen-Width")(`Screen-Width`.asInstanceOf[js.Any])
      __obj.updateDynamic("User-Language")(`User-Language`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Browser]
    }
    
    @scala.inline
    implicit class BrowserMutableBuilder[Self <: Browser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: String): Self = StObject.set(x, "Browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBrowser-Height`(value: Double): Self = StObject.set(x, "Browser-Height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBrowser-Name`(value: String): Self = StObject.set(x, "Browser-Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBrowser-Version`(value: String): Self = StObject.set(x, "Browser-Version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBrowser-Width`(value: Double): Self = StObject.set(x, "Browser-Width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColor-Depth`(value: Double): Self = StObject.set(x, "Color-Depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDocument-Mode`(value: Double): Self = StObject.set(x, "Document-Mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScreen-Height`(value: Double): Self = StObject.set(x, "Screen-Height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScreen-Width`(value: Double): Self = StObject.set(x, "Screen-Width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setUser-Language`(value: String): Self = StObject.set(x, "User-Language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtcOffset(value: Double): Self = StObject.set(x, "UtcOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClassName extends StObject {
    
    var ClassName: String
    
    var Message: String
    
    var StackTrace: js.Array[RaygunStackTrace]
  }
  object ClassName {
    
    @scala.inline
    def apply(ClassName: String, Message: String, StackTrace: js.Array[RaygunStackTrace]): ClassName = {
      val __obj = js.Dynamic.literal(ClassName = ClassName.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], StackTrace = StackTrace.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "ClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackTrace(value: js.Array[RaygunStackTrace]): Self = StObject.set(x, "StackTrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackTraceVarargs(value: RaygunStackTrace*): Self = StObject.set(x, "StackTrace", js.Array(value :_*))
    }
  }
  
  trait Client extends StObject {
    
    var Client: Version
    
    var Environment: Browser
    
    var Error: ClassName
    
    var GroupingKey: js.UndefOr[String] = js.undefined
    
    var Request: Headers
    
    var Tags: js.Array[String]
    
    var User: Email
    
    var UserCustomData: js.Any
    
    var Version: String
  }
  object Client {
    
    @scala.inline
    def apply(
      Client: Version,
      Environment: Browser,
      Error: ClassName,
      Request: Headers,
      Tags: js.Array[String],
      User: Email,
      UserCustomData: js.Any,
      Version: String
    ): Client = {
      val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], Environment = Environment.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], Request = Request.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], UserCustomData = UserCustomData.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Client]
    }
    
    @scala.inline
    implicit class ClientMutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: Version): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironment(value: Browser): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: ClassName): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupingKey(value: String): Self = StObject.set(x, "GroupingKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupingKeyUndefined: Self = StObject.set(x, "GroupingKey", js.undefined)
      
      @scala.inline
      def setRequest(value: Headers): Self = StObject.set(x, "Request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "Tags", js.Array(value :_*))
      
      @scala.inline
      def setUser(value: Email): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserCustomData(value: js.Any): Self = StObject.set(x, "UserCustomData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Duration extends StObject {
    
    var duration: Double
    
    var name: String
  }
  object Duration {
    
    @scala.inline
    def apply(duration: Double, name: String): Duration = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Duration]
    }
    
    @scala.inline
    implicit class DurationMutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Email extends StObject {
    
    var Email: js.UndefOr[String] = js.undefined
    
    var FirstName: js.UndefOr[String] = js.undefined
    
    var FullName: js.UndefOr[String] = js.undefined
    
    var Identifier: js.UndefOr[String] = js.undefined
    
    var IsAnonymous: js.UndefOr[Boolean] = js.undefined
    
    var UUID: js.UndefOr[js.Any] = js.undefined
  }
  object Email {
    
    @scala.inline
    def apply(): Email = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
      
      @scala.inline
      def setFirstName(value: String): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstNameUndefined: Self = StObject.set(x, "FirstName", js.undefined)
      
      @scala.inline
      def setFullName(value: String): Self = StObject.set(x, "FullName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullNameUndefined: Self = StObject.set(x, "FullName", js.undefined)
      
      @scala.inline
      def setIdentifier(value: String): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
      
      @scala.inline
      def setIsAnonymous(value: Boolean): Self = StObject.set(x, "IsAnonymous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAnonymousUndefined: Self = StObject.set(x, "IsAnonymous", js.undefined)
      
      @scala.inline
      def setUUID(value: js.Any): Self = StObject.set(x, "UUID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUUIDUndefined: Self = StObject.set(x, "UUID", js.undefined)
    }
  }
  
  trait Headers extends StObject {
    
    var Headers: Host
    
    var QueryString: String
    
    var Url: String
  }
  object Headers {
    
    @scala.inline
    def apply(Headers: Host, QueryString: String, Url: String): Headers = {
      val __obj = js.Dynamic.literal(Headers = Headers.asInstanceOf[js.Any], QueryString = QueryString.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit class HeadersMutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: Host): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryString(value: String): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Host extends StObject {
    
    var Host: String
    
    var Referer: String
    
    var `User-Agent`: String
  }
  object Host {
    
    @scala.inline
    def apply(Host: String, Referer: String, `User-Agent`: String): Host = {
      val __obj = js.Dynamic.literal(Host = Host.asInstanceOf[js.Any], Referer = Referer.asInstanceOf[js.Any])
      __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferer(value: String): Self = StObject.set(x, "Referer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setUser-Agent`(value: String): Self = StObject.set(x, "User-Agent", value.asInstanceOf[js.Any])
    }
  }
  
  trait Level extends StObject {
    
    var level: BreadcrumbLevel
    
    var location: String
    
    var message: String
    
    var metadata: js.Any
  }
  object Level {
    
    @scala.inline
    def apply(level: BreadcrumbLevel, location: String, message: String, metadata: js.Any): Level = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: BreadcrumbLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var duration: Double
    
    var name: String
    
    var `type`: String
  }
  object Name {
    
    @scala.inline
    def apply(duration: Double, name: String, `type`: String): Name = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Path extends StObject {
    
    var path: String
  }
  object Path {
    
    @scala.inline
    def apply(path: String): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var path: String
    
    var `type`: String
  }
  object Type {
    
    @scala.inline
    def apply(path: String, `type`: String): Type = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Version extends StObject {
    
    var Name: String
    
    var Version: String
  }
  object Version {
    
    @scala.inline
    def apply(Name: String, Version: String): Version = {
      val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Version]
    }
    
    @scala.inline
    implicit class VersionMutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    }
  }
}
