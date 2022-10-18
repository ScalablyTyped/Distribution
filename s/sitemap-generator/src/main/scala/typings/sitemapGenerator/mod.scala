package typings.sitemapGenerator

import typings.sitemapGenerator.anon.ChangeFreq
import typings.sitemapGenerator.sitemapGeneratorDoubles.`0.0`
import typings.sitemapGenerator.sitemapGeneratorDoubles.`0.1`
import typings.sitemapGenerator.sitemapGeneratorDoubles.`0.2`
import typings.sitemapGenerator.sitemapGeneratorDoubles.`0.3`
import typings.sitemapGenerator.sitemapGeneratorDoubles.`0.4`
import typings.sitemapGenerator.sitemapGeneratorDoubles.`0.5`
import typings.sitemapGenerator.sitemapGeneratorDoubles.`0.6`
import typings.sitemapGenerator.sitemapGeneratorDoubles.`0.7`
import typings.sitemapGenerator.sitemapGeneratorDoubles.`0.8`
import typings.sitemapGenerator.sitemapGeneratorDoubles.`0.9`
import typings.sitemapGenerator.sitemapGeneratorDoubles.`1.0`
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(url: String): Methods = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[Methods]
  inline def apply(url: String, options: Options): Methods = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Methods]
  
  @JSImport("sitemap-generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ErrorMessage extends StObject {
    
    var code: String
    
    var message: String
    
    var url: String
  }
  object ErrorMessage {
    
    inline def apply(code: String, message: String, url: String): ErrorMessage = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorMessage]
    }
    
    extension [Self <: ErrorMessage](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sitemapGenerator.sitemapGeneratorStrings.add
    - typings.sitemapGenerator.sitemapGeneratorStrings.done
    - typings.sitemapGenerator.sitemapGeneratorStrings.error
    - typings.sitemapGenerator.sitemapGeneratorStrings.ignore
  */
  trait EventTypes extends StObject
  object EventTypes {
    
    inline def add: typings.sitemapGenerator.sitemapGeneratorStrings.add = "add".asInstanceOf[typings.sitemapGenerator.sitemapGeneratorStrings.add]
    
    inline def done: typings.sitemapGenerator.sitemapGeneratorStrings.done = "done".asInstanceOf[typings.sitemapGenerator.sitemapGeneratorStrings.done]
    
    inline def error: typings.sitemapGenerator.sitemapGeneratorStrings.error = "error".asInstanceOf[typings.sitemapGenerator.sitemapGeneratorStrings.error]
    
    inline def ignore: typings.sitemapGenerator.sitemapGeneratorStrings.ignore = "ignore".asInstanceOf[typings.sitemapGenerator.sitemapGeneratorStrings.ignore]
  }
  
  type ExcludeFunctionProps[T] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): void? never : K}[keyof T] */ js.Any
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.sitemapGenerator.sitemapGeneratorStrings.always
    - typings.sitemapGenerator.sitemapGeneratorStrings.hourly
    - typings.sitemapGenerator.sitemapGeneratorStrings.daily
    - typings.sitemapGenerator.sitemapGeneratorStrings.weekly
    - typings.sitemapGenerator.sitemapGeneratorStrings.monthly
    - typings.sitemapGenerator.sitemapGeneratorStrings.yearly
    - typings.sitemapGenerator.sitemapGeneratorStrings.never
  */
  trait FreqValues extends StObject
  object FreqValues {
    
    inline def always: typings.sitemapGenerator.sitemapGeneratorStrings.always = "always".asInstanceOf[typings.sitemapGenerator.sitemapGeneratorStrings.always]
    
    inline def daily: typings.sitemapGenerator.sitemapGeneratorStrings.daily = "daily".asInstanceOf[typings.sitemapGenerator.sitemapGeneratorStrings.daily]
    
    inline def hourly: typings.sitemapGenerator.sitemapGeneratorStrings.hourly = "hourly".asInstanceOf[typings.sitemapGenerator.sitemapGeneratorStrings.hourly]
    
    inline def monthly: typings.sitemapGenerator.sitemapGeneratorStrings.monthly = "monthly".asInstanceOf[typings.sitemapGenerator.sitemapGeneratorStrings.monthly]
    
    inline def never: typings.sitemapGenerator.sitemapGeneratorStrings.never = "never".asInstanceOf[typings.sitemapGenerator.sitemapGeneratorStrings.never]
    
    inline def weekly: typings.sitemapGenerator.sitemapGeneratorStrings.weekly = "weekly".asInstanceOf[typings.sitemapGenerator.sitemapGeneratorStrings.weekly]
    
    inline def yearly: typings.sitemapGenerator.sitemapGeneratorStrings.yearly = "yearly".asInstanceOf[typings.sitemapGenerator.sitemapGeneratorStrings.yearly]
  }
  
  trait Methods extends StObject {
    
    def getCrawler(): typings.simplecrawler.mod.^
    
    def getSitemap(): SiteMapRotator
    
    @JSName("on")
    def on_error[T /* <: EventTypes */](
      events: T,
      cb: /* import warning: importer.ImportType#apply Failed type conversion: T extends 'error' ? (error : sitemap-generator.sitemap-generator.ErrorMessage): void : (): void */ js.Any
    ): Unit
    
    def queueURL(url: String): Unit
    
    def start(): Unit
    
    def stop(): Unit
  }
  object Methods {
    
    inline def apply(
      getCrawler: () => typings.simplecrawler.mod.^,
      getSitemap: () => SiteMapRotator,
      on: (Any, /* import warning: importer.ImportType#apply Failed type conversion: T extends 'error' ? (error : sitemap-generator.sitemap-generator.ErrorMessage): void : (): void */ js.Any) => Unit,
      queueURL: String => Unit,
      start: () => Unit,
      stop: () => Unit
    ): Methods = {
      val __obj = js.Dynamic.literal(getCrawler = js.Any.fromFunction0(getCrawler), getSitemap = js.Any.fromFunction0(getSitemap), on = js.Any.fromFunction2(on), queueURL = js.Any.fromFunction1(queueURL), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setGetCrawler(value: () => typings.simplecrawler.mod.^): Self = StObject.set(x, "getCrawler", js.Any.fromFunction0(value))
      
      inline def setGetSitemap(value: () => SiteMapRotator): Self = StObject.set(x, "getSitemap", js.Any.fromFunction0(value))
      
      inline def setOn(
        value: (Any, /* import warning: importer.ImportType#apply Failed type conversion: T extends 'error' ? (error : sitemap-generator.sitemap-generator.ErrorMessage): void : (): void */ js.Any) => Unit
      ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setQueueURL(value: String => Unit): Self = StObject.set(x, "queueURL", js.Any.fromFunction1(value))
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  type Options = Partial[ExcludeFunctionProps[typings.simplecrawler.mod.^]] & ChangeFreq
  
  /* Rewritten from type alias, can be one of: 
    - typings.sitemapGenerator.sitemapGeneratorDoubles.`0.0`
    - typings.sitemapGenerator.sitemapGeneratorDoubles.`0.1`
    - typings.sitemapGenerator.sitemapGeneratorDoubles.`0.2`
    - typings.sitemapGenerator.sitemapGeneratorDoubles.`0.3`
    - typings.sitemapGenerator.sitemapGeneratorDoubles.`0.4`
    - typings.sitemapGenerator.sitemapGeneratorDoubles.`0.5`
    - typings.sitemapGenerator.sitemapGeneratorDoubles.`0.6`
    - typings.sitemapGenerator.sitemapGeneratorDoubles.`0.7`
    - typings.sitemapGenerator.sitemapGeneratorDoubles.`0.8`
    - typings.sitemapGenerator.sitemapGeneratorDoubles.`0.9`
    - typings.sitemapGenerator.sitemapGeneratorDoubles.`1.0`
  */
  trait PriorityValues extends StObject
  object PriorityValues {
    
    inline def `0Dot0`: `0.0` = 0.0d.asInstanceOf[`0.0`]
    
    inline def `0Dot1`: `0.1` = 0.1d.asInstanceOf[`0.1`]
    
    inline def `0Dot2`: `0.2` = 0.2d.asInstanceOf[`0.2`]
    
    inline def `0Dot3`: `0.3` = 0.3d.asInstanceOf[`0.3`]
    
    inline def `0Dot4`: `0.4` = 0.4d.asInstanceOf[`0.4`]
    
    inline def `0Dot5`: `0.5` = 0.5d.asInstanceOf[`0.5`]
    
    inline def `0Dot6`: `0.6` = 0.6d.asInstanceOf[`0.6`]
    
    inline def `0Dot7`: `0.7` = 0.7d.asInstanceOf[`0.7`]
    
    inline def `0Dot8`: `0.8` = 0.8d.asInstanceOf[`0.8`]
    
    inline def `0Dot9`: `0.9` = 0.9d.asInstanceOf[`0.9`]
    
    inline def `1Dot0`: `1.0` = 1.0d.asInstanceOf[`1.0`]
  }
  
  @js.native
  trait SiteMapRotator extends StObject {
    
    def addURL(url: String): Unit = js.native
    def addURL(url: String, depth: Double): Unit = js.native
    def addURL(url: String, depth: Double, lastMod: String): Unit = js.native
    def addURL(url: String, depth: Unit, lastMod: String): Unit = js.native
    
    def finish(): Unit = js.native
    
    def getPaths(): js.Array[String] = js.native
  }
}
