package typings.protractorBeautifulReporter

import typings.jasmine.jasmine.CustomReporter
import typings.jasmine.jasmine.SpecResult
import typings.protractorBeautifulReporter.anon.Name
import typings.protractorBeautifulReporter.protractorBeautifulReporterStrings.belowHeader
import typings.protractorBeautifulReporter.protractorBeautifulReporterStrings.footer
import typings.protractorBeautifulReporter.protractorBeautifulReporterStrings.h
import typings.protractorBeautifulReporter.protractorBeautifulReporterStrings.hColonm
import typings.protractorBeautifulReporter.protractorBeautifulReporterStrings.hColonmColons
import typings.protractorBeautifulReporter.protractorBeautifulReporterStrings.header
import typings.protractorBeautifulReporter.protractorBeautifulReporterStrings.hm
import typings.protractorBeautifulReporter.protractorBeautifulReporterStrings.hms
import typings.protractorBeautifulReporter.protractorBeautifulReporterStrings.m
import typings.protractorBeautifulReporter.protractorBeautifulReporterStrings.ms
import typings.protractorBeautifulReporter.protractorBeautifulReporterStrings.s
import typings.seleniumWebdriver.mod.Capabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("protractor-beautiful-reporter", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with HtmlReporter {
    def this(options: HtmlReporterConstructorOptions) = this()
    
    /* CompleteClass */
    override def getJasmine2Reporter(): CustomReporter = js.native
    
    /* CompleteClass */
    override def jasmine2MetaDataBuilder(spec: Null, descriptions: js.Array[String], result: SpecResult, capabilities: Capabilities): StubMetaData = js.native
  }
  
  trait ClientDefaults extends StObject {
    
    var columnSettings: js.UndefOr[ColumnSettings] = js.undefined
    
    var searchSettings: js.UndefOr[SearchSettings] = js.undefined
    
    var showTotalDurationIn: js.UndefOr[header | belowHeader | footer] = js.undefined
    
    var totalDurationFormat: js.UndefOr[h | m | s | hm | hColonm | hms | hColonmColons | ms] = js.undefined
    
    var useAjax: js.UndefOr[Boolean] = js.undefined
  }
  object ClientDefaults {
    
    inline def apply(): ClientDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientDefaults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientDefaults] (val x: Self) extends AnyVal {
      
      inline def setColumnSettings(value: ColumnSettings): Self = StObject.set(x, "columnSettings", value.asInstanceOf[js.Any])
      
      inline def setColumnSettingsUndefined: Self = StObject.set(x, "columnSettings", js.undefined)
      
      inline def setSearchSettings(value: SearchSettings): Self = StObject.set(x, "searchSettings", value.asInstanceOf[js.Any])
      
      inline def setSearchSettingsUndefined: Self = StObject.set(x, "searchSettings", js.undefined)
      
      inline def setShowTotalDurationIn(value: header | belowHeader | footer): Self = StObject.set(x, "showTotalDurationIn", value.asInstanceOf[js.Any])
      
      inline def setShowTotalDurationInUndefined: Self = StObject.set(x, "showTotalDurationIn", js.undefined)
      
      inline def setTotalDurationFormat(value: h | m | s | hm | hColonm | hms | hColonmColons | ms): Self = StObject.set(x, "totalDurationFormat", value.asInstanceOf[js.Any])
      
      inline def setTotalDurationFormatUndefined: Self = StObject.set(x, "totalDurationFormat", js.undefined)
      
      inline def setUseAjax(value: Boolean): Self = StObject.set(x, "useAjax", value.asInstanceOf[js.Any])
      
      inline def setUseAjaxUndefined: Self = StObject.set(x, "useAjax", js.undefined)
    }
  }
  
  trait ColumnSettings extends StObject {
    
    var dangerTime: js.UndefOr[Double] = js.undefined
    
    var displayBrowser: js.UndefOr[Boolean] = js.undefined
    
    var displayOS: js.UndefOr[Boolean] = js.undefined
    
    var displaySessionId: js.UndefOr[Boolean] = js.undefined
    
    var displayTime: js.UndefOr[Boolean] = js.undefined
    
    var inlineScreenshots: js.UndefOr[Boolean] = js.undefined
    
    var warningTime: js.UndefOr[Double] = js.undefined
  }
  object ColumnSettings {
    
    inline def apply(): ColumnSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnSettings] (val x: Self) extends AnyVal {
      
      inline def setDangerTime(value: Double): Self = StObject.set(x, "dangerTime", value.asInstanceOf[js.Any])
      
      inline def setDangerTimeUndefined: Self = StObject.set(x, "dangerTime", js.undefined)
      
      inline def setDisplayBrowser(value: Boolean): Self = StObject.set(x, "displayBrowser", value.asInstanceOf[js.Any])
      
      inline def setDisplayBrowserUndefined: Self = StObject.set(x, "displayBrowser", js.undefined)
      
      inline def setDisplayOS(value: Boolean): Self = StObject.set(x, "displayOS", value.asInstanceOf[js.Any])
      
      inline def setDisplayOSUndefined: Self = StObject.set(x, "displayOS", js.undefined)
      
      inline def setDisplaySessionId(value: Boolean): Self = StObject.set(x, "displaySessionId", value.asInstanceOf[js.Any])
      
      inline def setDisplaySessionIdUndefined: Self = StObject.set(x, "displaySessionId", js.undefined)
      
      inline def setDisplayTime(value: Boolean): Self = StObject.set(x, "displayTime", value.asInstanceOf[js.Any])
      
      inline def setDisplayTimeUndefined: Self = StObject.set(x, "displayTime", js.undefined)
      
      inline def setInlineScreenshots(value: Boolean): Self = StObject.set(x, "inlineScreenshots", value.asInstanceOf[js.Any])
      
      inline def setInlineScreenshotsUndefined: Self = StObject.set(x, "inlineScreenshots", js.undefined)
      
      inline def setWarningTime(value: Double): Self = StObject.set(x, "warningTime", value.asInstanceOf[js.Any])
      
      inline def setWarningTimeUndefined: Self = StObject.set(x, "warningTime", js.undefined)
    }
  }
  
  trait HtmlReporter extends StObject {
    
    def getJasmine2Reporter(): CustomReporter
    
    def jasmine2MetaDataBuilder(spec: Null, descriptions: js.Array[String], result: SpecResult, capabilities: Capabilities): StubMetaData
  }
  object HtmlReporter {
    
    inline def apply(
      getJasmine2Reporter: () => CustomReporter,
      jasmine2MetaDataBuilder: (Null, js.Array[String], SpecResult, Capabilities) => StubMetaData
    ): HtmlReporter = {
      val __obj = js.Dynamic.literal(getJasmine2Reporter = js.Any.fromFunction0(getJasmine2Reporter), jasmine2MetaDataBuilder = js.Any.fromFunction4(jasmine2MetaDataBuilder))
      __obj.asInstanceOf[HtmlReporter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HtmlReporter] (val x: Self) extends AnyVal {
      
      inline def setGetJasmine2Reporter(value: () => CustomReporter): Self = StObject.set(x, "getJasmine2Reporter", js.Any.fromFunction0(value))
      
      inline def setJasmine2MetaDataBuilder(value: (Null, js.Array[String], SpecResult, Capabilities) => StubMetaData): Self = StObject.set(x, "jasmine2MetaDataBuilder", js.Any.fromFunction4(value))
    }
  }
  
  trait HtmlReporterConstructorOptions extends StObject {
    
    var baseDirectory: String
    
    var clientDefaults: js.UndefOr[ClientDefaults] = js.undefined
    
    var cssOverrideFile: js.UndefOr[String] = js.undefined
    
    var customCssInline: js.UndefOr[String] = js.undefined
    
    var disableScreenshots: js.UndefOr[Boolean] = js.undefined
    
    var docName: js.UndefOr[String] = js.undefined
    
    var docTitle: js.UndefOr[String] = js.undefined
    
    var excludeSkippedSpecs: js.UndefOr[Boolean] = js.undefined
    
    var gatherBrowserLogs: js.UndefOr[Boolean] = js.undefined
    
    var jasmine2MetaDataBuilder: js.UndefOr[
        js.Function4[
          /* spec */ Null, 
          /* descriptions */ js.Array[String], 
          /* result */ SpecResult, 
          /* capabilities */ Capabilities, 
          StubMetaData
        ]
      ] = js.undefined
    
    var jsonsSubfolder: js.UndefOr[String] = js.undefined
    
    var pathBuilder: js.UndefOr[
        js.Function4[
          /* spec */ Null, 
          /* descriptions */ js.Array[String], 
          /* result */ SpecResult, 
          /* capabilities */ Capabilities, 
          String
        ]
      ] = js.undefined
    
    var preserveDirectory: js.UndefOr[Boolean] = js.undefined
    
    var screenshotsSubfolder: js.UndefOr[String] = js.undefined
    
    var sortFunction: js.UndefOr[js.Function2[/* a */ MetaData, /* b */ MetaData, Double]] = js.undefined
    
    var takeScreenShotsForSkippedSpecs: js.UndefOr[Boolean] = js.undefined
    
    var takeScreenShotsOnlyForFailedSpecs: js.UndefOr[Boolean] = js.undefined
  }
  object HtmlReporterConstructorOptions {
    
    inline def apply(baseDirectory: String): HtmlReporterConstructorOptions = {
      val __obj = js.Dynamic.literal(baseDirectory = baseDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlReporterConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HtmlReporterConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setBaseDirectory(value: String): Self = StObject.set(x, "baseDirectory", value.asInstanceOf[js.Any])
      
      inline def setClientDefaults(value: ClientDefaults): Self = StObject.set(x, "clientDefaults", value.asInstanceOf[js.Any])
      
      inline def setClientDefaultsUndefined: Self = StObject.set(x, "clientDefaults", js.undefined)
      
      inline def setCssOverrideFile(value: String): Self = StObject.set(x, "cssOverrideFile", value.asInstanceOf[js.Any])
      
      inline def setCssOverrideFileUndefined: Self = StObject.set(x, "cssOverrideFile", js.undefined)
      
      inline def setCustomCssInline(value: String): Self = StObject.set(x, "customCssInline", value.asInstanceOf[js.Any])
      
      inline def setCustomCssInlineUndefined: Self = StObject.set(x, "customCssInline", js.undefined)
      
      inline def setDisableScreenshots(value: Boolean): Self = StObject.set(x, "disableScreenshots", value.asInstanceOf[js.Any])
      
      inline def setDisableScreenshotsUndefined: Self = StObject.set(x, "disableScreenshots", js.undefined)
      
      inline def setDocName(value: String): Self = StObject.set(x, "docName", value.asInstanceOf[js.Any])
      
      inline def setDocNameUndefined: Self = StObject.set(x, "docName", js.undefined)
      
      inline def setDocTitle(value: String): Self = StObject.set(x, "docTitle", value.asInstanceOf[js.Any])
      
      inline def setDocTitleUndefined: Self = StObject.set(x, "docTitle", js.undefined)
      
      inline def setExcludeSkippedSpecs(value: Boolean): Self = StObject.set(x, "excludeSkippedSpecs", value.asInstanceOf[js.Any])
      
      inline def setExcludeSkippedSpecsUndefined: Self = StObject.set(x, "excludeSkippedSpecs", js.undefined)
      
      inline def setGatherBrowserLogs(value: Boolean): Self = StObject.set(x, "gatherBrowserLogs", value.asInstanceOf[js.Any])
      
      inline def setGatherBrowserLogsUndefined: Self = StObject.set(x, "gatherBrowserLogs", js.undefined)
      
      inline def setJasmine2MetaDataBuilder(
        value: (/* spec */ Null, /* descriptions */ js.Array[String], /* result */ SpecResult, /* capabilities */ Capabilities) => StubMetaData
      ): Self = StObject.set(x, "jasmine2MetaDataBuilder", js.Any.fromFunction4(value))
      
      inline def setJasmine2MetaDataBuilderUndefined: Self = StObject.set(x, "jasmine2MetaDataBuilder", js.undefined)
      
      inline def setJsonsSubfolder(value: String): Self = StObject.set(x, "jsonsSubfolder", value.asInstanceOf[js.Any])
      
      inline def setJsonsSubfolderUndefined: Self = StObject.set(x, "jsonsSubfolder", js.undefined)
      
      inline def setPathBuilder(
        value: (/* spec */ Null, /* descriptions */ js.Array[String], /* result */ SpecResult, /* capabilities */ Capabilities) => String
      ): Self = StObject.set(x, "pathBuilder", js.Any.fromFunction4(value))
      
      inline def setPathBuilderUndefined: Self = StObject.set(x, "pathBuilder", js.undefined)
      
      inline def setPreserveDirectory(value: Boolean): Self = StObject.set(x, "preserveDirectory", value.asInstanceOf[js.Any])
      
      inline def setPreserveDirectoryUndefined: Self = StObject.set(x, "preserveDirectory", js.undefined)
      
      inline def setScreenshotsSubfolder(value: String): Self = StObject.set(x, "screenshotsSubfolder", value.asInstanceOf[js.Any])
      
      inline def setScreenshotsSubfolderUndefined: Self = StObject.set(x, "screenshotsSubfolder", js.undefined)
      
      inline def setSortFunction(value: (/* a */ MetaData, /* b */ MetaData) => Double): Self = StObject.set(x, "sortFunction", js.Any.fromFunction2(value))
      
      inline def setSortFunctionUndefined: Self = StObject.set(x, "sortFunction", js.undefined)
      
      inline def setTakeScreenShotsForSkippedSpecs(value: Boolean): Self = StObject.set(x, "takeScreenShotsForSkippedSpecs", value.asInstanceOf[js.Any])
      
      inline def setTakeScreenShotsForSkippedSpecsUndefined: Self = StObject.set(x, "takeScreenShotsForSkippedSpecs", js.undefined)
      
      inline def setTakeScreenShotsOnlyForFailedSpecs(value: Boolean): Self = StObject.set(x, "takeScreenShotsOnlyForFailedSpecs", value.asInstanceOf[js.Any])
      
      inline def setTakeScreenShotsOnlyForFailedSpecsUndefined: Self = StObject.set(x, "takeScreenShotsOnlyForFailedSpecs", js.undefined)
    }
  }
  
  trait MetaData
    extends StObject
       with StubMetaData {
    
    var duration: Double
    
    var screenShotFile: js.UndefOr[String] = js.undefined
    
    var timestamp: Double
  }
  object MetaData {
    
    inline def apply(
      browser: Name,
      description: String,
      duration: Double,
      instanceId: Double,
      os: String,
      passed: Boolean,
      pending: Boolean,
      sessionId: String,
      timestamp: Double
    ): MetaData = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetaData] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setScreenShotFile(value: String): Self = StObject.set(x, "screenShotFile", value.asInstanceOf[js.Any])
      
      inline def setScreenShotFileUndefined: Self = StObject.set(x, "screenShotFile", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchSettings extends StObject {
    
    var allselected: js.UndefOr[Boolean] = js.undefined
    
    var failed: js.UndefOr[Boolean] = js.undefined
    
    var passed: js.UndefOr[Boolean] = js.undefined
    
    var pending: js.UndefOr[Boolean] = js.undefined
    
    var withLog: js.UndefOr[Boolean] = js.undefined
  }
  object SearchSettings {
    
    inline def apply(): SearchSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchSettings] (val x: Self) extends AnyVal {
      
      inline def setAllselected(value: Boolean): Self = StObject.set(x, "allselected", value.asInstanceOf[js.Any])
      
      inline def setAllselectedUndefined: Self = StObject.set(x, "allselected", js.undefined)
      
      inline def setFailed(value: Boolean): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
      
      inline def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
      
      inline def setPassedUndefined: Self = StObject.set(x, "passed", js.undefined)
      
      inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      inline def setWithLog(value: Boolean): Self = StObject.set(x, "withLog", value.asInstanceOf[js.Any])
      
      inline def setWithLogUndefined: Self = StObject.set(x, "withLog", js.undefined)
    }
  }
  
  trait StubMetaData extends StObject {
    
    var browser: Name
    
    var description: String
    
    var instanceId: Double
    
    var os: String
    
    var passed: Boolean
    
    var pending: Boolean
    
    var sessionId: String
  }
  object StubMetaData {
    
    inline def apply(
      browser: Name,
      description: String,
      instanceId: Double,
      os: String,
      passed: Boolean,
      pending: Boolean,
      sessionId: String
    ): StubMetaData = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[StubMetaData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StubMetaData] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: Name): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setInstanceId(value: Double): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
      
      inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    }
  }
}
