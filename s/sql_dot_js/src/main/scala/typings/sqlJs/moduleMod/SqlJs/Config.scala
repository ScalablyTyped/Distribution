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
trait Config extends js.Object {
  var FAST_MEMORY: js.UndefOr[Double] = js.undefined
  var FHEAP: js.UndefOr[Float64Array] = js.undefined
  var HEAP: js.UndefOr[Int32Array] = js.undefined
  var HEAP16: js.UndefOr[Int16Array] = js.undefined
  var HEAP32: js.UndefOr[Int32Array] = js.undefined
  var HEAP8: js.UndefOr[Int8Array] = js.undefined
  var HEAPF32: js.UndefOr[Float32Array] = js.undefined
  var HEAPF64: js.UndefOr[Float64Array] = js.undefined
  var HEAPU16: js.UndefOr[Uint16Array] = js.undefined
  var HEAPU32: js.UndefOr[Uint32Array] = js.undefined
  var HEAPU8: js.UndefOr[Uint8Array] = js.undefined
  var IHEAP: js.UndefOr[Int32Array] = js.undefined
  var TOTAL_MEMORY: js.UndefOr[Double] = js.undefined
  var TOTAL_STACK: js.UndefOr[Double] = js.undefined
  var _free: js.UndefOr[js.Function1[/* ptr */ Double, Unit]] = js.undefined
  var _malloc: js.UndefOr[js.Function1[/* size */ Double, Double]] = js.undefined
  var addOnExit: js.UndefOr[js.Function1[/* cb */ js.Function0[_], Unit]] = js.undefined
  var addOnInit: js.UndefOr[js.Function1[/* cb */ js.Function0[_], Unit]] = js.undefined
  var addOnPostRun: js.UndefOr[js.Function1[/* cb */ js.Function0[_], Unit]] = js.undefined
  var addOnPreMain: js.UndefOr[js.Function1[/* cb */ js.Function0[_], Unit]] = js.undefined
  var addOnPreRun: js.UndefOr[js.Function1[/* cb */ js.Function0[_], Unit]] = js.undefined
  var arguments: js.UndefOr[js.Array[String]] = js.undefined
  var destroy: js.UndefOr[js.Function1[/* object */ js.Object, Unit]] = js.undefined
  var environment: js.UndefOr[EnvironmentType] = js.undefined
  var filePackagePrefixURL: js.UndefOr[String] = js.undefined
  var getPreloadedPackage: js.UndefOr[
    js.Function2[/* remotePackageName */ String, /* remotePackageSize */ Double, ArrayBuffer]
  ] = js.undefined
  var instantiateWasm: js.UndefOr[
    js.Function2[
      /* imports */ WebAssemblyImports, 
      /* successCallback */ js.Function1[/* module */ Module, Unit], 
      WebAssemblyExports
    ]
  ] = js.undefined
  var locateFile: js.UndefOr[js.Function2[/* url */ String, /* scriptDirectory */ String, String]] = js.undefined
  var logReadFiles: js.UndefOr[Boolean] = js.undefined
  var noExitRuntime: js.UndefOr[Boolean] = js.undefined
  var noInitialRun: js.UndefOr[Boolean] = js.undefined
  var onAbort: js.UndefOr[js.Function1[/* what */ js.Any, Unit]] = js.undefined
  var onCustomMessage: js.UndefOr[js.Function1[/* event */ MessageEvent, Unit]] = js.undefined
  var onRuntimeInitialized: js.UndefOr[js.Function0[Unit]] = js.undefined
  var postRun: js.UndefOr[js.Array[js.Function0[Unit]]] = js.undefined
  var preInit: js.UndefOr[js.Array[js.Function0[Unit]]] = js.undefined
  var preRun: js.UndefOr[js.Array[js.Function0[Unit]]] = js.undefined
  var preinitializedWebGLContext: js.UndefOr[WebGLRenderingContext] = js.undefined
  var preloadedAudios: js.UndefOr[js.Any] = js.undefined
  var preloadedImages: js.UndefOr[js.Any] = js.undefined
  var print: js.UndefOr[js.Function1[/* str */ String, Unit]] = js.undefined
  var printErr: js.UndefOr[js.Function1[/* str */ String, Unit]] = js.undefined
  var `then`: js.UndefOr[
    js.Function1[/* callback */ js.Function1[/* module */ this.type, Unit], this.type]
  ] = js.undefined
  var wasmBinary: js.UndefOr[ArrayBuffer] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    FAST_MEMORY: Int | Double = null,
    FHEAP: Float64Array = null,
    HEAP: Int32Array = null,
    HEAP16: Int16Array = null,
    HEAP32: Int32Array = null,
    HEAP8: Int8Array = null,
    HEAPF32: Float32Array = null,
    HEAPF64: Float64Array = null,
    HEAPU16: Uint16Array = null,
    HEAPU32: Uint32Array = null,
    HEAPU8: Uint8Array = null,
    IHEAP: Int32Array = null,
    TOTAL_MEMORY: Int | Double = null,
    TOTAL_STACK: Int | Double = null,
    _free: /* ptr */ Double => Unit = null,
    _malloc: /* size */ Double => Double = null,
    addOnExit: /* cb */ js.Function0[_] => Unit = null,
    addOnInit: /* cb */ js.Function0[_] => Unit = null,
    addOnPostRun: /* cb */ js.Function0[_] => Unit = null,
    addOnPreMain: /* cb */ js.Function0[_] => Unit = null,
    addOnPreRun: /* cb */ js.Function0[_] => Unit = null,
    arguments: js.Array[String] = null,
    destroy: /* object */ js.Object => Unit = null,
    environment: EnvironmentType = null,
    filePackagePrefixURL: String = null,
    getPreloadedPackage: (/* remotePackageName */ String, /* remotePackageSize */ Double) => ArrayBuffer = null,
    instantiateWasm: (/* imports */ WebAssemblyImports, /* successCallback */ js.Function1[/* module */ Module, Unit]) => WebAssemblyExports = null,
    locateFile: (/* url */ String, /* scriptDirectory */ String) => String = null,
    logReadFiles: js.UndefOr[Boolean] = js.undefined,
    noExitRuntime: js.UndefOr[Boolean] = js.undefined,
    noInitialRun: js.UndefOr[Boolean] = js.undefined,
    onAbort: /* what */ js.Any => Unit = null,
    onCustomMessage: /* event */ MessageEvent => Unit = null,
    onRuntimeInitialized: () => Unit = null,
    postRun: js.Array[js.Function0[Unit]] = null,
    preInit: js.Array[js.Function0[Unit]] = null,
    preRun: js.Array[js.Function0[Unit]] = null,
    preinitializedWebGLContext: WebGLRenderingContext = null,
    preloadedAudios: js.Any = null,
    preloadedImages: js.Any = null,
    print: /* str */ String => Unit = null,
    printErr: /* str */ String => Unit = null,
    `then`: /* callback */ js.Function1[Config, Unit] => Config = null,
    wasmBinary: ArrayBuffer = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (FAST_MEMORY != null) __obj.updateDynamic("FAST_MEMORY")(FAST_MEMORY.asInstanceOf[js.Any])
    if (FHEAP != null) __obj.updateDynamic("FHEAP")(FHEAP.asInstanceOf[js.Any])
    if (HEAP != null) __obj.updateDynamic("HEAP")(HEAP.asInstanceOf[js.Any])
    if (HEAP16 != null) __obj.updateDynamic("HEAP16")(HEAP16.asInstanceOf[js.Any])
    if (HEAP32 != null) __obj.updateDynamic("HEAP32")(HEAP32.asInstanceOf[js.Any])
    if (HEAP8 != null) __obj.updateDynamic("HEAP8")(HEAP8.asInstanceOf[js.Any])
    if (HEAPF32 != null) __obj.updateDynamic("HEAPF32")(HEAPF32.asInstanceOf[js.Any])
    if (HEAPF64 != null) __obj.updateDynamic("HEAPF64")(HEAPF64.asInstanceOf[js.Any])
    if (HEAPU16 != null) __obj.updateDynamic("HEAPU16")(HEAPU16.asInstanceOf[js.Any])
    if (HEAPU32 != null) __obj.updateDynamic("HEAPU32")(HEAPU32.asInstanceOf[js.Any])
    if (HEAPU8 != null) __obj.updateDynamic("HEAPU8")(HEAPU8.asInstanceOf[js.Any])
    if (IHEAP != null) __obj.updateDynamic("IHEAP")(IHEAP.asInstanceOf[js.Any])
    if (TOTAL_MEMORY != null) __obj.updateDynamic("TOTAL_MEMORY")(TOTAL_MEMORY.asInstanceOf[js.Any])
    if (TOTAL_STACK != null) __obj.updateDynamic("TOTAL_STACK")(TOTAL_STACK.asInstanceOf[js.Any])
    if (_free != null) __obj.updateDynamic("_free")(js.Any.fromFunction1(_free))
    if (_malloc != null) __obj.updateDynamic("_malloc")(js.Any.fromFunction1(_malloc))
    if (addOnExit != null) __obj.updateDynamic("addOnExit")(js.Any.fromFunction1(addOnExit))
    if (addOnInit != null) __obj.updateDynamic("addOnInit")(js.Any.fromFunction1(addOnInit))
    if (addOnPostRun != null) __obj.updateDynamic("addOnPostRun")(js.Any.fromFunction1(addOnPostRun))
    if (addOnPreMain != null) __obj.updateDynamic("addOnPreMain")(js.Any.fromFunction1(addOnPreMain))
    if (addOnPreRun != null) __obj.updateDynamic("addOnPreRun")(js.Any.fromFunction1(addOnPreRun))
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (filePackagePrefixURL != null) __obj.updateDynamic("filePackagePrefixURL")(filePackagePrefixURL.asInstanceOf[js.Any])
    if (getPreloadedPackage != null) __obj.updateDynamic("getPreloadedPackage")(js.Any.fromFunction2(getPreloadedPackage))
    if (instantiateWasm != null) __obj.updateDynamic("instantiateWasm")(js.Any.fromFunction2(instantiateWasm))
    if (locateFile != null) __obj.updateDynamic("locateFile")(js.Any.fromFunction2(locateFile))
    if (!js.isUndefined(logReadFiles)) __obj.updateDynamic("logReadFiles")(logReadFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(noExitRuntime)) __obj.updateDynamic("noExitRuntime")(noExitRuntime.asInstanceOf[js.Any])
    if (!js.isUndefined(noInitialRun)) __obj.updateDynamic("noInitialRun")(noInitialRun.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onCustomMessage != null) __obj.updateDynamic("onCustomMessage")(js.Any.fromFunction1(onCustomMessage))
    if (onRuntimeInitialized != null) __obj.updateDynamic("onRuntimeInitialized")(js.Any.fromFunction0(onRuntimeInitialized))
    if (postRun != null) __obj.updateDynamic("postRun")(postRun.asInstanceOf[js.Any])
    if (preInit != null) __obj.updateDynamic("preInit")(preInit.asInstanceOf[js.Any])
    if (preRun != null) __obj.updateDynamic("preRun")(preRun.asInstanceOf[js.Any])
    if (preinitializedWebGLContext != null) __obj.updateDynamic("preinitializedWebGLContext")(preinitializedWebGLContext.asInstanceOf[js.Any])
    if (preloadedAudios != null) __obj.updateDynamic("preloadedAudios")(preloadedAudios.asInstanceOf[js.Any])
    if (preloadedImages != null) __obj.updateDynamic("preloadedImages")(preloadedImages.asInstanceOf[js.Any])
    if (print != null) __obj.updateDynamic("print")(js.Any.fromFunction1(print))
    if (printErr != null) __obj.updateDynamic("printErr")(js.Any.fromFunction1(printErr))
    if (`then` != null) __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    if (wasmBinary != null) __obj.updateDynamic("wasmBinary")(wasmBinary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

