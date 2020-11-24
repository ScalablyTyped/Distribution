package typings.rollup

import typings.rollup.mod.AsyncPluginHooks
import typings.rollup.mod.ChangeEvent
import typings.rollup.mod.FirstPluginHooks
import typings.rollup.mod.InternalModuleFormat
import typings.rollup.mod.ModuleFormat
import typings.rollup.mod.ParallelPluginHooks
import typings.rollup.mod.PluginValueHooks
import typings.rollup.mod.PreserveEntrySignaturesOption
import typings.rollup.mod.SequentialPluginHooks
import typings.rollup.mod.SyncPluginHooks
import typings.rollup.mod._InteropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rollupStrings {
  
  @scala.inline
  def BUNDLE_END: BUNDLE_END = "BUNDLE_END".asInstanceOf[BUNDLE_END]
  
  @scala.inline
  def BUNDLE_START: BUNDLE_START = "BUNDLE_START".asInstanceOf[BUNDLE_START]
  
  @scala.inline
  def END: END = "END".asInstanceOf[END]
  
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @scala.inline
  def PartialNull: PartialNull = "PartialNull".asInstanceOf[PartialNull]
  
  @scala.inline
  def START: START = "START".asInstanceOf[START]
  
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  
  @scala.inline
  def `allow-extension`: `allow-extension` = "allow-extension".asInstanceOf[`allow-extension`]
  
  @scala.inline
  def amd: amd = "amd".asInstanceOf[amd]
  
  @scala.inline
  def asset: asset = "asset".asInstanceOf[asset]
  
  @scala.inline
  def augmentChunkHash: augmentChunkHash = "augmentChunkHash".asInstanceOf[augmentChunkHash]
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @scala.inline
  def banner: banner = "banner".asInstanceOf[banner]
  
  @scala.inline
  def buildEnd: buildEnd = "buildEnd".asInstanceOf[buildEnd]
  
  @scala.inline
  def buildStart: buildStart = "buildStart".asInstanceOf[buildStart]
  
  @scala.inline
  def chunk: chunk = "chunk".asInstanceOf[chunk]
  
  @scala.inline
  def cjs: cjs = "cjs".asInstanceOf[cjs]
  
  @scala.inline
  def closeWatcher: closeWatcher = "closeWatcher".asInstanceOf[closeWatcher]
  
  @scala.inline
  def commonjs: commonjs = "commonjs".asInstanceOf[commonjs]
  
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @scala.inline
  def defaultOnly: defaultOnly = "defaultOnly".asInstanceOf[defaultOnly]
  
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  
  @scala.inline
  def es: es = "es".asInstanceOf[es]
  
  @scala.inline
  def esModule: esModule = "esModule".asInstanceOf[esModule]
  
  @scala.inline
  def esm: esm = "esm".asInstanceOf[esm]
  
  @scala.inline
  def `exports-only`: `exports-only` = "exports-only".asInstanceOf[`exports-only`]
  
  @scala.inline
  def footer: footer = "footer".asInstanceOf[footer]
  
  @scala.inline
  def generateBundle: generateBundle = "generateBundle".asInstanceOf[generateBundle]
  
  @scala.inline
  def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @scala.inline
  def iife: iife = "iife".asInstanceOf[iife]
  
  @scala.inline
  def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @scala.inline
  def intro: intro = "intro".asInstanceOf[intro]
  
  @scala.inline
  def load: load = "load".asInstanceOf[load]
  
  @scala.inline
  def module: module = "module".asInstanceOf[module]
  
  @scala.inline
  def moduleParsed: moduleParsed = "moduleParsed".asInstanceOf[moduleParsed]
  
  @scala.inline
  def named: named = "named".asInstanceOf[named]
  
  @scala.inline
  def `no-external`: `no-external` = "no-external".asInstanceOf[`no-external`]
  
  @scala.inline
  def `no-treeshake`: `no-treeshake` = "no-treeshake".asInstanceOf[`no-treeshake`]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def options: options = "options".asInstanceOf[options]
  
  @scala.inline
  def outputOptions: outputOptions = "outputOptions".asInstanceOf[outputOptions]
  
  @scala.inline
  def outro: outro = "outro".asInstanceOf[outro]
  
  @scala.inline
  def placeholder: placeholder = "placeholder".asInstanceOf[placeholder]
  
  @scala.inline
  def renderChunk: renderChunk = "renderChunk".asInstanceOf[renderChunk]
  
  @scala.inline
  def renderDynamicImport: renderDynamicImport = "renderDynamicImport".asInstanceOf[renderDynamicImport]
  
  @scala.inline
  def renderError: renderError = "renderError".asInstanceOf[renderError]
  
  @scala.inline
  def renderStart: renderStart = "renderStart".asInstanceOf[renderStart]
  
  @scala.inline
  def resolveAssetUrl: resolveAssetUrl = "resolveAssetUrl".asInstanceOf[resolveAssetUrl]
  
  @scala.inline
  def resolveDynamicImport: resolveDynamicImport = "resolveDynamicImport".asInstanceOf[resolveDynamicImport]
  
  @scala.inline
  def resolveFileUrl: resolveFileUrl = "resolveFileUrl".asInstanceOf[resolveFileUrl]
  
  @scala.inline
  def resolveId: resolveId = "resolveId".asInstanceOf[resolveId]
  
  @scala.inline
  def resolveImportMeta: resolveImportMeta = "resolveImportMeta".asInstanceOf[resolveImportMeta]
  
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  
  @scala.inline
  def system: system = "system".asInstanceOf[system]
  
  @scala.inline
  def systemjs: systemjs = "systemjs".asInstanceOf[systemjs]
  
  @scala.inline
  def transform: transform = "transform".asInstanceOf[transform]
  
  @scala.inline
  def umd: umd = "umd".asInstanceOf[umd]
  
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  
  @scala.inline
  def watchChange: watchChange = "watchChange".asInstanceOf[watchChange]
  
  @scala.inline
  def writeBundle: writeBundle = "writeBundle".asInstanceOf[writeBundle]
  
  @js.native
  sealed trait BUNDLE_END extends js.Object
  
  @js.native
  sealed trait BUNDLE_START extends js.Object
  
  @js.native
  sealed trait END extends js.Object
  
  @js.native
  sealed trait ERROR extends js.Object
  
  @js.native
  sealed trait PartialNull extends js.Object
  
  @js.native
  sealed trait START extends js.Object
  
  @js.native
  sealed trait _empty extends js.Object
  
  @js.native
  sealed trait `allow-extension` extends PreserveEntrySignaturesOption
  
  @js.native
  sealed trait amd
    extends InternalModuleFormat
       with ModuleFormat
  
  @js.native
  sealed trait asset extends js.Object
  
  @js.native
  sealed trait augmentChunkHash
    extends SequentialPluginHooks
       with SyncPluginHooks
  
  @js.native
  sealed trait auto extends _InteropType
  
  @js.native
  sealed trait banner
    extends ParallelPluginHooks
       with PluginValueHooks
  
  @js.native
  sealed trait buildEnd
    extends AsyncPluginHooks
       with ParallelPluginHooks
  
  @js.native
  sealed trait buildStart
    extends AsyncPluginHooks
       with ParallelPluginHooks
  
  @js.native
  sealed trait chunk extends js.Object
  
  @js.native
  sealed trait cjs
    extends InternalModuleFormat
       with ModuleFormat
  
  @js.native
  sealed trait closeWatcher
    extends SequentialPluginHooks
       with SyncPluginHooks
  
  @js.native
  sealed trait commonjs extends ModuleFormat
  
  @js.native
  sealed trait create extends ChangeEvent
  
  @js.native
  sealed trait default extends _InteropType
  
  @js.native
  sealed trait defaultOnly extends _InteropType
  
  @js.native
  sealed trait delete extends ChangeEvent
  
  @js.native
  sealed trait es
    extends InternalModuleFormat
       with ModuleFormat
  
  @js.native
  sealed trait esModule extends _InteropType
  
  @js.native
  sealed trait esm extends ModuleFormat
  
  @js.native
  sealed trait `exports-only` extends PreserveEntrySignaturesOption
  
  @js.native
  sealed trait footer
    extends ParallelPluginHooks
       with PluginValueHooks
  
  @js.native
  sealed trait generateBundle
    extends AsyncPluginHooks
       with SequentialPluginHooks
  
  @js.native
  sealed trait hidden extends js.Object
  
  @js.native
  sealed trait iife
    extends InternalModuleFormat
       with ModuleFormat
  
  @js.native
  sealed trait `inline` extends js.Object
  
  @js.native
  sealed trait intro
    extends ParallelPluginHooks
       with PluginValueHooks
  
  @js.native
  sealed trait load
    extends AsyncPluginHooks
       with FirstPluginHooks
  
  @js.native
  sealed trait module extends ModuleFormat
  
  @js.native
  sealed trait moduleParsed
    extends AsyncPluginHooks
       with ParallelPluginHooks
  
  @js.native
  sealed trait named extends js.Object
  
  @js.native
  sealed trait `no-external` extends js.Object
  
  @js.native
  sealed trait `no-treeshake` extends js.Object
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait options
    extends AsyncPluginHooks
       with SequentialPluginHooks
  
  @js.native
  sealed trait outputOptions
    extends SequentialPluginHooks
       with SyncPluginHooks
  
  @js.native
  sealed trait outro
    extends ParallelPluginHooks
       with PluginValueHooks
  
  @js.native
  sealed trait placeholder extends js.Object
  
  @js.native
  sealed trait renderChunk
    extends AsyncPluginHooks
       with SequentialPluginHooks
  
  @js.native
  sealed trait renderDynamicImport
    extends FirstPluginHooks
       with SyncPluginHooks
  
  @js.native
  sealed trait renderError
    extends AsyncPluginHooks
       with ParallelPluginHooks
  
  @js.native
  sealed trait renderStart
    extends AsyncPluginHooks
       with ParallelPluginHooks
  
  @js.native
  sealed trait resolveAssetUrl
    extends FirstPluginHooks
       with SyncPluginHooks
  
  @js.native
  sealed trait resolveDynamicImport
    extends AsyncPluginHooks
       with FirstPluginHooks
  
  @js.native
  sealed trait resolveFileUrl
    extends FirstPluginHooks
       with SyncPluginHooks
  
  @js.native
  sealed trait resolveId
    extends AsyncPluginHooks
       with FirstPluginHooks
  
  @js.native
  sealed trait resolveImportMeta
    extends FirstPluginHooks
       with SyncPluginHooks
  
  @js.native
  sealed trait strict extends PreserveEntrySignaturesOption
  
  @js.native
  sealed trait system
    extends InternalModuleFormat
       with ModuleFormat
  
  @js.native
  sealed trait systemjs extends ModuleFormat
  
  @js.native
  sealed trait transform
    extends AsyncPluginHooks
       with SequentialPluginHooks
  
  @js.native
  sealed trait umd
    extends InternalModuleFormat
       with ModuleFormat
  
  @js.native
  sealed trait update extends ChangeEvent
  
  @js.native
  sealed trait watchChange
    extends SequentialPluginHooks
       with SyncPluginHooks
  
  @js.native
  sealed trait writeBundle
    extends AsyncPluginHooks
       with ParallelPluginHooks
}
