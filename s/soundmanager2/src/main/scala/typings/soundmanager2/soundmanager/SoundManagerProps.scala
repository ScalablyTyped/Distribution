package typings.soundmanager2.soundmanager

import typings.soundmanager2.soundmanager2Booleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoundManagerProps extends js.Object {
  
  var allowScriptAccess: js.UndefOr[ScriptAccess] = js.native
  
  var altURL: js.UndefOr[String] = js.native
  
  var bgColor: js.UndefOr[String] = js.native
  
  var consoleOnly: js.UndefOr[Boolean] = js.native
  
  var debugFlash: js.UndefOr[Boolean] = js.native
  
  var debugMode: js.UndefOr[Boolean] = js.native
  
  var defaultOptions: js.UndefOr[DefaultOptions] = js.native
  
  /**
    * Some properties are dynamic, determined at initialisation or later
    * during runtime, and should be treated as read-only.
    */
  val features: js.UndefOr[js.Object] = js.native
  
  var flash9Options: js.UndefOr[Flash9Options] = js.native
  
  // html5PollingInterval: number;
  // html5Test: string;
  var flashLoadTimeout: js.UndefOr[Double] = js.native
  
  var flashVersion: js.UndefOr[Double] = js.native
  
  // flashPollingInterval: number;
  var forceUseGlobalHTML5Audio: js.UndefOr[Boolean] = js.native
  
  val html5Only: js.UndefOr[Boolean] = js.native
  
  var idPrefix: js.UndefOr[String] = js.native
  
  var ignoreMobileRestrications: js.UndefOr[Boolean] = js.native
  
  var movieStarOptions: js.UndefOr[MovieStarOptions] = js.native
  
  var noSWFCache: js.UndefOr[Boolean] = js.native
  
  var onready: js.UndefOr[js.Function0[Unit]] = js.native
  
  var ontimeout: js.UndefOr[js.Function0[Unit]] = js.native
  
  var preferFlash: js.UndefOr[Boolean] = js.native
  
  /**
    * The directory where SM2 can find the flash movies (soundmanager2.swf,
    * soundmanager2_flash9.swf and debug versions etc.) Note that SM2 will
    * append the correct SWF file name, depending on flashVersion and
    * debugMode settings.
    */
  var url: js.UndefOr[String] = js.native
  
  var useAltURL: js.UndefOr[Boolean] = js.native
  
  var useConsole: js.UndefOr[Boolean] = js.native
  
  var useFlashBlock: js.UndefOr[Boolean] = js.native
  
  var useHTML5Audio: js.UndefOr[Boolean] = js.native
  
  var useHighPerformance: js.UndefOr[Boolean] = js.native
  
  var waitForWindowLoad: js.UndefOr[`false`] = js.native
  
  var wmode: js.UndefOr[String | Null] = js.native
}
object SoundManagerProps {
  
  @scala.inline
  def apply(): SoundManagerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoundManagerProps]
  }
  
  @scala.inline
  implicit class SoundManagerPropsOps[Self <: SoundManagerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowScriptAccess(value: ScriptAccess): Self = this.set("allowScriptAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowScriptAccess: Self = this.set("allowScriptAccess", js.undefined)
    
    @scala.inline
    def setAltURL(value: String): Self = this.set("altURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltURL: Self = this.set("altURL", js.undefined)
    
    @scala.inline
    def setBgColor(value: String): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
    
    @scala.inline
    def setConsoleOnly(value: Boolean): Self = this.set("consoleOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsoleOnly: Self = this.set("consoleOnly", js.undefined)
    
    @scala.inline
    def setDebugFlash(value: Boolean): Self = this.set("debugFlash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugFlash: Self = this.set("debugFlash", js.undefined)
    
    @scala.inline
    def setDebugMode(value: Boolean): Self = this.set("debugMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugMode: Self = this.set("debugMode", js.undefined)
    
    @scala.inline
    def setDefaultOptions(value: DefaultOptions): Self = this.set("defaultOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultOptions: Self = this.set("defaultOptions", js.undefined)
    
    @scala.inline
    def setFeatures(value: js.Object): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setFlash9Options(value: Flash9Options): Self = this.set("flash9Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlash9Options: Self = this.set("flash9Options", js.undefined)
    
    @scala.inline
    def setFlashLoadTimeout(value: Double): Self = this.set("flashLoadTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlashLoadTimeout: Self = this.set("flashLoadTimeout", js.undefined)
    
    @scala.inline
    def setFlashVersion(value: Double): Self = this.set("flashVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlashVersion: Self = this.set("flashVersion", js.undefined)
    
    @scala.inline
    def setForceUseGlobalHTML5Audio(value: Boolean): Self = this.set("forceUseGlobalHTML5Audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceUseGlobalHTML5Audio: Self = this.set("forceUseGlobalHTML5Audio", js.undefined)
    
    @scala.inline
    def setHtml5Only(value: Boolean): Self = this.set("html5Only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml5Only: Self = this.set("html5Only", js.undefined)
    
    @scala.inline
    def setIdPrefix(value: String): Self = this.set("idPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdPrefix: Self = this.set("idPrefix", js.undefined)
    
    @scala.inline
    def setIgnoreMobileRestrications(value: Boolean): Self = this.set("ignoreMobileRestrications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreMobileRestrications: Self = this.set("ignoreMobileRestrications", js.undefined)
    
    @scala.inline
    def setMovieStarOptions(value: MovieStarOptions): Self = this.set("movieStarOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovieStarOptions: Self = this.set("movieStarOptions", js.undefined)
    
    @scala.inline
    def setNoSWFCache(value: Boolean): Self = this.set("noSWFCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoSWFCache: Self = this.set("noSWFCache", js.undefined)
    
    @scala.inline
    def setOnready(value: () => Unit): Self = this.set("onready", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnready: Self = this.set("onready", js.undefined)
    
    @scala.inline
    def setOntimeout(value: () => Unit): Self = this.set("ontimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOntimeout: Self = this.set("ontimeout", js.undefined)
    
    @scala.inline
    def setPreferFlash(value: Boolean): Self = this.set("preferFlash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferFlash: Self = this.set("preferFlash", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUseAltURL(value: Boolean): Self = this.set("useAltURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAltURL: Self = this.set("useAltURL", js.undefined)
    
    @scala.inline
    def setUseConsole(value: Boolean): Self = this.set("useConsole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseConsole: Self = this.set("useConsole", js.undefined)
    
    @scala.inline
    def setUseFlashBlock(value: Boolean): Self = this.set("useFlashBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseFlashBlock: Self = this.set("useFlashBlock", js.undefined)
    
    @scala.inline
    def setUseHTML5Audio(value: Boolean): Self = this.set("useHTML5Audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHTML5Audio: Self = this.set("useHTML5Audio", js.undefined)
    
    @scala.inline
    def setUseHighPerformance(value: Boolean): Self = this.set("useHighPerformance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHighPerformance: Self = this.set("useHighPerformance", js.undefined)
    
    @scala.inline
    def setWaitForWindowLoad(value: `false`): Self = this.set("waitForWindowLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForWindowLoad: Self = this.set("waitForWindowLoad", js.undefined)
    
    @scala.inline
    def setWmode(value: String): Self = this.set("wmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWmode: Self = this.set("wmode", js.undefined)
    
    @scala.inline
    def setWmodeNull: Self = this.set("wmode", null)
  }
}
