package typings.puppeteerCore.apiDocsEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def EVALUATION_SCRIPT_URL: /* "__puppeteer_evaluation_script__" */ java.lang.String = typings.puppeteerCore.apiDocsEntryMod.^.asInstanceOf[js.Dynamic].selectDynamic("EVALUATION_SCRIPT_URL").asInstanceOf[/* "__puppeteer_evaluation_script__" */ java.lang.String]

@scala.inline
def clearCustomQueryHandlers(): scala.Unit = typings.puppeteerCore.apiDocsEntryMod.^.asInstanceOf[js.Dynamic].applyDynamic("clearCustomQueryHandlers")().asInstanceOf[scala.Unit]

@scala.inline
def connectToBrowser(options: typings.puppeteerCore.anon.BrowserOptionsbrowserWSEnBrowserURL): js.Promise[typings.puppeteerCore.commonBrowserMod.Browser] = typings.puppeteerCore.apiDocsEntryMod.^.asInstanceOf[js.Dynamic].applyDynamic("connectToBrowser")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.puppeteerCore.commonBrowserMod.Browser]]

@scala.inline
def createJSHandle(
  context: typings.puppeteerCore.commonExecutionContextMod.ExecutionContext,
  remoteObject: typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
): typings.puppeteerCore.commonJshandleMod.JSHandle = (typings.puppeteerCore.apiDocsEntryMod.^.asInstanceOf[js.Dynamic].applyDynamic("createJSHandle")(context.asInstanceOf[js.Any], remoteObject.asInstanceOf[js.Any])).asInstanceOf[typings.puppeteerCore.commonJshandleMod.JSHandle]

@scala.inline
def customQueryHandlerNames(): js.Array[java.lang.String] = typings.puppeteerCore.apiDocsEntryMod.^.asInstanceOf[js.Dynamic].applyDynamic("customQueryHandlerNames")().asInstanceOf[js.Array[java.lang.String]]

@scala.inline
def devicesMap: typings.puppeteerCore.commonDeviceDescriptorsMod.DevicesMap_ = typings.puppeteerCore.apiDocsEntryMod.^.asInstanceOf[js.Dynamic].selectDynamic("devicesMap").asInstanceOf[typings.puppeteerCore.commonDeviceDescriptorsMod.DevicesMap_]

@scala.inline
def getQueryHandlerAndSelector(selector: java.lang.String): typings.puppeteerCore.anon.UpdatedSelector = typings.puppeteerCore.apiDocsEntryMod.^.asInstanceOf[js.Dynamic].applyDynamic("getQueryHandlerAndSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[typings.puppeteerCore.anon.UpdatedSelector]

@scala.inline
def puppeteerErrors: typings.puppeteerCore.commonErrorsMod.PuppeteerErrors_ = typings.puppeteerCore.apiDocsEntryMod.^.asInstanceOf[js.Dynamic].selectDynamic("puppeteerErrors").asInstanceOf[typings.puppeteerCore.commonErrorsMod.PuppeteerErrors_]

@scala.inline
def registerCustomQueryHandler(name: java.lang.String, handler: typings.puppeteerCore.commonQueryHandlerMod.CustomQueryHandler): scala.Unit = (typings.puppeteerCore.apiDocsEntryMod.^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomQueryHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def unregisterCustomQueryHandler(name: java.lang.String): scala.Unit = typings.puppeteerCore.apiDocsEntryMod.^.asInstanceOf[js.Dynamic].applyDynamic("unregisterCustomQueryHandler")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
