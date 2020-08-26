package typings.sqlJs.moduleMod.SqlJs

import typings.emscripten.Emscripten.EnvironmentType
import typings.emscripten.Emscripten.WebAssemblyExports
import typings.emscripten.Emscripten.WebAssemblyImports
import typings.emscripten.WebAssembly.Module
import typings.std.ArrayBuffer
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.MessageEvent
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<emscripten.EmscriptenModule> */
@js.native
trait Config extends js.Object {
  var FAST_MEMORY: js.UndefOr[Double] = js.native
  var FHEAP: js.UndefOr[Float64Array] = js.native
  var HEAP: js.UndefOr[Int32Array] = js.native
  var HEAP16: js.UndefOr[Int16Array] = js.native
  var HEAP32: js.UndefOr[Int32Array] = js.native
  var HEAP8: js.UndefOr[Int8Array] = js.native
  var HEAPF32: js.UndefOr[Float32Array] = js.native
  var HEAPF64: js.UndefOr[Float64Array] = js.native
  var HEAPU16: js.UndefOr[Uint16Array] = js.native
  var HEAPU32: js.UndefOr[Uint32Array] = js.native
  var HEAPU8: js.UndefOr[Uint8Array] = js.native
  var IHEAP: js.UndefOr[Int32Array] = js.native
  var TOTAL_MEMORY: js.UndefOr[Double] = js.native
  var TOTAL_STACK: js.UndefOr[Double] = js.native
  var _free: js.UndefOr[js.Function1[/* ptr */ Double, Unit]] = js.native
  var _malloc: js.UndefOr[js.Function1[/* size */ Double, Double]] = js.native
  var addOnExit: js.UndefOr[js.Function1[/* cb */ js.Function0[_], Unit]] = js.native
  var addOnInit: js.UndefOr[js.Function1[/* cb */ js.Function0[_], Unit]] = js.native
  var addOnPostRun: js.UndefOr[js.Function1[/* cb */ js.Function0[_], Unit]] = js.native
  var addOnPreMain: js.UndefOr[js.Function1[/* cb */ js.Function0[_], Unit]] = js.native
  var addOnPreRun: js.UndefOr[js.Function1[/* cb */ js.Function0[_], Unit]] = js.native
  var arguments: js.UndefOr[js.Array[String]] = js.native
  var destroy: js.UndefOr[js.Function1[/* object */ js.Object, Unit]] = js.native
  var environment: js.UndefOr[EnvironmentType] = js.native
  var filePackagePrefixURL: js.UndefOr[String] = js.native
  var getPreloadedPackage: js.UndefOr[
    js.Function2[/* remotePackageName */ String, /* remotePackageSize */ Double, ArrayBuffer]
  ] = js.native
  var instantiateWasm: js.UndefOr[
    js.Function2[
      /* imports */ WebAssemblyImports, 
      /* successCallback */ js.Function1[/* module */ Module, Unit], 
      WebAssemblyExports
    ]
  ] = js.native
  var locateFile: js.UndefOr[js.Function2[/* url */ String, /* scriptDirectory */ String, String]] = js.native
  var logReadFiles: js.UndefOr[Boolean] = js.native
  var noExitRuntime: js.UndefOr[Boolean] = js.native
  var noInitialRun: js.UndefOr[Boolean] = js.native
  var onAbort: js.UndefOr[js.Function1[/* what */ js.Any, Unit]] = js.native
  var onCustomMessage: js.UndefOr[js.Function1[/* event */ MessageEvent, Unit]] = js.native
  var onRuntimeInitialized: js.UndefOr[js.Function0[Unit]] = js.native
  var postRun: js.UndefOr[js.Array[js.Function0[Unit]]] = js.native
  var preInit: js.UndefOr[js.Array[js.Function0[Unit]]] = js.native
  var preRun: js.UndefOr[js.Array[js.Function0[Unit]]] = js.native
  var preinitializedWebGLContext: js.UndefOr[WebGLRenderingContext] = js.native
  var preloadedAudios: js.UndefOr[js.Any] = js.native
  var preloadedImages: js.UndefOr[js.Any] = js.native
  var print: js.UndefOr[js.Function1[/* str */ String, Unit]] = js.native
  var printErr: js.UndefOr[js.Function1[/* str */ String, Unit]] = js.native
  var wasmBinary: js.UndefOr[ArrayBuffer] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setFAST_MEMORY(value: Double): Self = this.set("FAST_MEMORY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFAST_MEMORY: Self = this.set("FAST_MEMORY", js.undefined)
    @scala.inline
    def setFHEAP(value: Float64Array): Self = this.set("FHEAP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFHEAP: Self = this.set("FHEAP", js.undefined)
    @scala.inline
    def setHEAP(value: Int32Array): Self = this.set("HEAP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHEAP: Self = this.set("HEAP", js.undefined)
    @scala.inline
    def setHEAP16(value: Int16Array): Self = this.set("HEAP16", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHEAP16: Self = this.set("HEAP16", js.undefined)
    @scala.inline
    def setHEAP32(value: Int32Array): Self = this.set("HEAP32", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHEAP32: Self = this.set("HEAP32", js.undefined)
    @scala.inline
    def setHEAP8(value: Int8Array): Self = this.set("HEAP8", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHEAP8: Self = this.set("HEAP8", js.undefined)
    @scala.inline
    def setHEAPF32(value: Float32Array): Self = this.set("HEAPF32", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHEAPF32: Self = this.set("HEAPF32", js.undefined)
    @scala.inline
    def setHEAPF64(value: Float64Array): Self = this.set("HEAPF64", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHEAPF64: Self = this.set("HEAPF64", js.undefined)
    @scala.inline
    def setHEAPU16(value: Uint16Array): Self = this.set("HEAPU16", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHEAPU16: Self = this.set("HEAPU16", js.undefined)
    @scala.inline
    def setHEAPU32(value: Uint32Array): Self = this.set("HEAPU32", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHEAPU32: Self = this.set("HEAPU32", js.undefined)
    @scala.inline
    def setHEAPU8(value: Uint8Array): Self = this.set("HEAPU8", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHEAPU8: Self = this.set("HEAPU8", js.undefined)
    @scala.inline
    def setIHEAP(value: Int32Array): Self = this.set("IHEAP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIHEAP: Self = this.set("IHEAP", js.undefined)
    @scala.inline
    def setTOTAL_MEMORY(value: Double): Self = this.set("TOTAL_MEMORY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTOTAL_MEMORY: Self = this.set("TOTAL_MEMORY", js.undefined)
    @scala.inline
    def setTOTAL_STACK(value: Double): Self = this.set("TOTAL_STACK", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTOTAL_STACK: Self = this.set("TOTAL_STACK", js.undefined)
    @scala.inline
    def set_free(value: /* ptr */ Double => Unit): Self = this.set("_free", js.Any.fromFunction1(value))
    @scala.inline
    def delete_free: Self = this.set("_free", js.undefined)
    @scala.inline
    def set_malloc(value: /* size */ Double => Double): Self = this.set("_malloc", js.Any.fromFunction1(value))
    @scala.inline
    def delete_malloc: Self = this.set("_malloc", js.undefined)
    @scala.inline
    def setAddOnExit(value: /* cb */ js.Function0[_] => Unit): Self = this.set("addOnExit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddOnExit: Self = this.set("addOnExit", js.undefined)
    @scala.inline
    def setAddOnInit(value: /* cb */ js.Function0[_] => Unit): Self = this.set("addOnInit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddOnInit: Self = this.set("addOnInit", js.undefined)
    @scala.inline
    def setAddOnPostRun(value: /* cb */ js.Function0[_] => Unit): Self = this.set("addOnPostRun", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddOnPostRun: Self = this.set("addOnPostRun", js.undefined)
    @scala.inline
    def setAddOnPreMain(value: /* cb */ js.Function0[_] => Unit): Self = this.set("addOnPreMain", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddOnPreMain: Self = this.set("addOnPreMain", js.undefined)
    @scala.inline
    def setAddOnPreRun(value: /* cb */ js.Function0[_] => Unit): Self = this.set("addOnPreRun", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddOnPreRun: Self = this.set("addOnPreRun", js.undefined)
    @scala.inline
    def setArgumentsVarargs(value: String*): Self = this.set("arguments", js.Array(value :_*))
    @scala.inline
    def setArguments(value: js.Array[String]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    @scala.inline
    def setDestroy(value: /* object */ js.Object => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setEnvironment(value: EnvironmentType): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setFilePackagePrefixURL(value: String): Self = this.set("filePackagePrefixURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilePackagePrefixURL: Self = this.set("filePackagePrefixURL", js.undefined)
    @scala.inline
    def setGetPreloadedPackage(value: (/* remotePackageName */ String, /* remotePackageSize */ Double) => ArrayBuffer): Self = this.set("getPreloadedPackage", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetPreloadedPackage: Self = this.set("getPreloadedPackage", js.undefined)
    @scala.inline
    def setInstantiateWasm(
      value: (/* imports */ WebAssemblyImports, /* successCallback */ js.Function1[/* module */ Module, Unit]) => WebAssemblyExports
    ): Self = this.set("instantiateWasm", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInstantiateWasm: Self = this.set("instantiateWasm", js.undefined)
    @scala.inline
    def setLocateFile(value: (/* url */ String, /* scriptDirectory */ String) => String): Self = this.set("locateFile", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLocateFile: Self = this.set("locateFile", js.undefined)
    @scala.inline
    def setLogReadFiles(value: Boolean): Self = this.set("logReadFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogReadFiles: Self = this.set("logReadFiles", js.undefined)
    @scala.inline
    def setNoExitRuntime(value: Boolean): Self = this.set("noExitRuntime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoExitRuntime: Self = this.set("noExitRuntime", js.undefined)
    @scala.inline
    def setNoInitialRun(value: Boolean): Self = this.set("noInitialRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoInitialRun: Self = this.set("noInitialRun", js.undefined)
    @scala.inline
    def setOnAbort(value: /* what */ js.Any => Unit): Self = this.set("onAbort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    @scala.inline
    def setOnCustomMessage(value: /* event */ MessageEvent => Unit): Self = this.set("onCustomMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCustomMessage: Self = this.set("onCustomMessage", js.undefined)
    @scala.inline
    def setOnRuntimeInitialized(value: () => Unit): Self = this.set("onRuntimeInitialized", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnRuntimeInitialized: Self = this.set("onRuntimeInitialized", js.undefined)
    @scala.inline
    def setPostRunVarargs(value: js.Function0[Unit]*): Self = this.set("postRun", js.Array(value :_*))
    @scala.inline
    def setPostRun(value: js.Array[js.Function0[Unit]]): Self = this.set("postRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostRun: Self = this.set("postRun", js.undefined)
    @scala.inline
    def setPreInitVarargs(value: js.Function0[Unit]*): Self = this.set("preInit", js.Array(value :_*))
    @scala.inline
    def setPreInit(value: js.Array[js.Function0[Unit]]): Self = this.set("preInit", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreInit: Self = this.set("preInit", js.undefined)
    @scala.inline
    def setPreRunVarargs(value: js.Function0[Unit]*): Self = this.set("preRun", js.Array(value :_*))
    @scala.inline
    def setPreRun(value: js.Array[js.Function0[Unit]]): Self = this.set("preRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreRun: Self = this.set("preRun", js.undefined)
    @scala.inline
    def setPreinitializedWebGLContext(value: WebGLRenderingContext): Self = this.set("preinitializedWebGLContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreinitializedWebGLContext: Self = this.set("preinitializedWebGLContext", js.undefined)
    @scala.inline
    def setPreloadedAudios(value: js.Any): Self = this.set("preloadedAudios", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreloadedAudios: Self = this.set("preloadedAudios", js.undefined)
    @scala.inline
    def setPreloadedImages(value: js.Any): Self = this.set("preloadedImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreloadedImages: Self = this.set("preloadedImages", js.undefined)
    @scala.inline
    def setPrint(value: /* str */ String => Unit): Self = this.set("print", js.Any.fromFunction1(value))
    @scala.inline
    def deletePrint: Self = this.set("print", js.undefined)
    @scala.inline
    def setPrintErr(value: /* str */ String => Unit): Self = this.set("printErr", js.Any.fromFunction1(value))
    @scala.inline
    def deletePrintErr: Self = this.set("printErr", js.undefined)
    @scala.inline
    def setWasmBinary(value: ArrayBuffer): Self = this.set("wasmBinary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWasmBinary: Self = this.set("wasmBinary", js.undefined)
  }
  
}

