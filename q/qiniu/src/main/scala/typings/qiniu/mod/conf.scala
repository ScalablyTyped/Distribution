package typings.qiniu.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conf {
  
  @JSImport("qiniu", "conf")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("qiniu", "conf.ACCESS_KEY")
  @js.native
  def ACCESS_KEY: String = js.native
  inline def ACCESS_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACCESS_KEY")(x.asInstanceOf[js.Any])
  
  @JSImport("qiniu", "conf.BLOCK_SIZE")
  @js.native
  def BLOCK_SIZE: Double = js.native
  inline def BLOCK_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLOCK_SIZE")(x.asInstanceOf[js.Any])
  
  @JSImport("qiniu", "conf.Config")
  @js.native
  open class Config ()
    extends StObject
       with ConfigOptions {
    def this(options: ConfigOptions) = this()
  }
  
  @JSImport("qiniu", "conf.FormMimeJson")
  @js.native
  def FormMimeJson: String = js.native
  inline def FormMimeJson_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FormMimeJson")(x.asInstanceOf[js.Any])
  
  @JSImport("qiniu", "conf.FormMimeRaw")
  @js.native
  def FormMimeRaw: String = js.native
  inline def FormMimeRaw_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FormMimeRaw")(x.asInstanceOf[js.Any])
  
  @JSImport("qiniu", "conf.FormMimeUrl")
  @js.native
  def FormMimeUrl: String = js.native
  inline def FormMimeUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FormMimeUrl")(x.asInstanceOf[js.Any])
  
  @JSImport("qiniu", "conf.RPC_TIMEOUT")
  @js.native
  def RPC_TIMEOUT: Double = js.native
  inline def RPC_TIMEOUT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RPC_TIMEOUT")(x.asInstanceOf[js.Any])
  
  @JSImport("qiniu", "conf.RS_HOST")
  @js.native
  def RS_HOST: String = js.native
  inline def RS_HOST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RS_HOST")(x.asInstanceOf[js.Any])
  
  @JSImport("qiniu", "conf.SECRET_KEY")
  @js.native
  def SECRET_KEY: String = js.native
  inline def SECRET_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECRET_KEY")(x.asInstanceOf[js.Any])
  
  @JSImport("qiniu", "conf.USER_AGENT")
  @js.native
  def USER_AGENT: String = js.native
  inline def USER_AGENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_AGENT")(x.asInstanceOf[js.Any])
  
  @JSImport("qiniu", "conf.Zone")
  @js.native
  open class Zone protected () extends StObject {
    def this(
      srcUpHosts: js.UndefOr[Any],
      cdnUpHosts: js.UndefOr[Any],
      ioHost: js.UndefOr[String],
      rsHost: js.UndefOr[String],
      rsfHost: js.UndefOr[String],
      apiHost: js.UndefOr[String]
    ) = this()
    
    var apiHost: String = js.native
    
    var cdnUpHosts: Any = js.native
    
    var ioHost: String = js.native
    
    var rsHost: String = js.native
    
    var rsfHost: String = js.native
    
    var srcUpHosts: Any = js.native
  }
  
  trait ConfigOptions extends StObject {
    
    /**
      * @default true
      */
    var useCdnDomain: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default false
      */
    var useHttpsDomain: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default null
      */
    var zone: js.UndefOr[Zone] = js.undefined
    
    /**
      * @default -1
      */
    var zoneExpire: js.UndefOr[Double] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    extension [Self <: ConfigOptions](x: Self) {
      
      inline def setUseCdnDomain(value: Boolean): Self = StObject.set(x, "useCdnDomain", value.asInstanceOf[js.Any])
      
      inline def setUseCdnDomainUndefined: Self = StObject.set(x, "useCdnDomain", js.undefined)
      
      inline def setUseHttpsDomain(value: Boolean): Self = StObject.set(x, "useHttpsDomain", value.asInstanceOf[js.Any])
      
      inline def setUseHttpsDomainUndefined: Self = StObject.set(x, "useHttpsDomain", js.undefined)
      
      inline def setZone(value: Zone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
      
      inline def setZoneExpire(value: Double): Self = StObject.set(x, "zoneExpire", value.asInstanceOf[js.Any])
      
      inline def setZoneExpireUndefined: Self = StObject.set(x, "zoneExpire", js.undefined)
      
      inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
    }
  }
}
