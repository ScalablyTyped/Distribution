package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def EVALUATION_SCRIPT_URL: /* "__puppeteer_evaluation_script__" */ java.lang.String = typings.puppeteerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("EVALUATION_SCRIPT_URL").asInstanceOf[/* "__puppeteer_evaluation_script__" */ java.lang.String]

inline def clearCustomQueryHandlers(): scala.Unit = typings.puppeteerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearCustomQueryHandlers")().asInstanceOf[scala.Unit]

inline def connectToBrowser(options: typings.puppeteerCore.anon.BrowserOptionsbrowserWSEn): js.Promise[typings.puppeteerCore.browserMod.Browser] = typings.puppeteerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectToBrowser")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.puppeteerCore.browserMod.Browser]]

inline def createJSHandle(
  context: typings.puppeteerCore.executionContextMod.ExecutionContext,
  remoteObject: typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
): typings.puppeteerCore.jshandleMod.JSHandle = (typings.puppeteerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createJSHandle")(context.asInstanceOf[js.Any], remoteObject.asInstanceOf[js.Any])).asInstanceOf[typings.puppeteerCore.jshandleMod.JSHandle]

inline def customQueryHandlerNames(): js.Array[java.lang.String] = typings.puppeteerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("customQueryHandlerNames")().asInstanceOf[js.Array[java.lang.String]]

inline def devicesMap: typings.puppeteerCore.deviceDescriptorsMod.DevicesMap_ = typings.puppeteerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("devicesMap").asInstanceOf[typings.puppeteerCore.deviceDescriptorsMod.DevicesMap_]

inline def getQueryHandlerAndSelector(selector: java.lang.String): typings.puppeteerCore.anon.QueryHandler = typings.puppeteerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getQueryHandlerAndSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[typings.puppeteerCore.anon.QueryHandler]

inline def puppeteerErrors: typings.puppeteerCore.errorsMod.PuppeteerErrors_ = typings.puppeteerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("puppeteerErrors").asInstanceOf[typings.puppeteerCore.errorsMod.PuppeteerErrors_]

inline def registerCustomQueryHandler(name: java.lang.String, handler: typings.puppeteerCore.queryHandlerMod.CustomQueryHandler): scala.Unit = (typings.puppeteerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomQueryHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def unregisterCustomQueryHandler(name: java.lang.String): scala.Unit = typings.puppeteerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unregisterCustomQueryHandler")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
