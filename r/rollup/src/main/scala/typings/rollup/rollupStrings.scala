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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rollupStrings {
  
  @js.native
  sealed trait default extends _InteropType
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait BUNDLE_END extends StObject
  @scala.inline
  def BUNDLE_END: BUNDLE_END = "BUNDLE_END".asInstanceOf[BUNDLE_END]
  
  @js.native
  sealed trait BUNDLE_START extends StObject
  @scala.inline
  def BUNDLE_START: BUNDLE_START = "BUNDLE_START".asInstanceOf[BUNDLE_START]
  
  @js.native
  sealed trait END extends StObject
  @scala.inline
  def END: END = "END".asInstanceOf[END]
  
  @js.native
  sealed trait ERROR extends StObject
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait PartialNull extends StObject
  @scala.inline
  def PartialNull: PartialNull = "PartialNull".asInstanceOf[PartialNull]
  
  @js.native
  sealed trait START extends StObject
  @scala.inline
  def START: START = "START".asInstanceOf[START]
  
  @js.native
  sealed trait _empty extends StObject
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait `allow-extension` extends PreserveEntrySignaturesOption
  @scala.inline
  def `allow-extension`: `allow-extension` = "allow-extension".asInstanceOf[`allow-extension`]
  
  @js.native
  sealed trait amd
    extends InternalModuleFormat
       with ModuleFormat
  @scala.inline
  def amd: amd = "amd".asInstanceOf[amd]
  
  @js.native
  sealed trait asset extends StObject
  @scala.inline
  def asset: asset = "asset".asInstanceOf[asset]
  
  @js.native
  sealed trait augmentChunkHash
    extends SequentialPluginHooks
       with SyncPluginHooks
  @scala.inline
  def augmentChunkHash: augmentChunkHash = "augmentChunkHash".asInstanceOf[augmentChunkHash]
  
  @js.native
  sealed trait auto extends _InteropType
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait banner
    extends ParallelPluginHooks
       with PluginValueHooks
  @scala.inline
  def banner: banner = "banner".asInstanceOf[banner]
  
  @js.native
  sealed trait buildEnd
    extends AsyncPluginHooks
       with ParallelPluginHooks
  @scala.inline
  def buildEnd: buildEnd = "buildEnd".asInstanceOf[buildEnd]
  
  @js.native
  sealed trait buildStart
    extends AsyncPluginHooks
       with ParallelPluginHooks
  @scala.inline
  def buildStart: buildStart = "buildStart".asInstanceOf[buildStart]
  
  @js.native
  sealed trait chunk extends StObject
  @scala.inline
  def chunk: chunk = "chunk".asInstanceOf[chunk]
  
  @js.native
  sealed trait cjs
    extends InternalModuleFormat
       with ModuleFormat
  @scala.inline
  def cjs: cjs = "cjs".asInstanceOf[cjs]
  
  @js.native
  sealed trait closeWatcher
    extends SequentialPluginHooks
       with SyncPluginHooks
  @scala.inline
  def closeWatcher: closeWatcher = "closeWatcher".asInstanceOf[closeWatcher]
  
  @js.native
  sealed trait commonjs extends ModuleFormat
  @scala.inline
  def commonjs: commonjs = "commonjs".asInstanceOf[commonjs]
  
  @js.native
  sealed trait create extends ChangeEvent
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait defaultOnly extends _InteropType
  @scala.inline
  def defaultOnly: defaultOnly = "defaultOnly".asInstanceOf[defaultOnly]
  
  @js.native
  sealed trait delete extends ChangeEvent
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait es
    extends InternalModuleFormat
       with ModuleFormat
  @scala.inline
  def es: es = "es".asInstanceOf[es]
  
  @js.native
  sealed trait esModule extends _InteropType
  @scala.inline
  def esModule: esModule = "esModule".asInstanceOf[esModule]
  
  @js.native
  sealed trait esm extends ModuleFormat
  @scala.inline
  def esm: esm = "esm".asInstanceOf[esm]
  
  @js.native
  sealed trait `exports-only` extends PreserveEntrySignaturesOption
  @scala.inline
  def `exports-only`: `exports-only` = "exports-only".asInstanceOf[`exports-only`]
  
  @js.native
  sealed trait footer
    extends ParallelPluginHooks
       with PluginValueHooks
  @scala.inline
  def footer: footer = "footer".asInstanceOf[footer]
  
  @js.native
  sealed trait generateBundle
    extends AsyncPluginHooks
       with SequentialPluginHooks
  @scala.inline
  def generateBundle: generateBundle = "generateBundle".asInstanceOf[generateBundle]
  
  @js.native
  sealed trait hidden extends StObject
  @scala.inline
  def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait iife
    extends InternalModuleFormat
       with ModuleFormat
  @scala.inline
  def iife: iife = "iife".asInstanceOf[iife]
  
  @js.native
  sealed trait `inline` extends StObject
  @scala.inline
  def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @js.native
  sealed trait intro
    extends ParallelPluginHooks
       with PluginValueHooks
  @scala.inline
  def intro: intro = "intro".asInstanceOf[intro]
  
  @js.native
  sealed trait load
    extends AsyncPluginHooks
       with FirstPluginHooks
  @scala.inline
  def load: load = "load".asInstanceOf[load]
  
  @js.native
  sealed trait module extends ModuleFormat
  @scala.inline
  def module: module = "module".asInstanceOf[module]
  
  @js.native
  sealed trait moduleParsed
    extends AsyncPluginHooks
       with ParallelPluginHooks
  @scala.inline
  def moduleParsed: moduleParsed = "moduleParsed".asInstanceOf[moduleParsed]
  
  @js.native
  sealed trait named extends StObject
  @scala.inline
  def named: named = "named".asInstanceOf[named]
  
  @js.native
  sealed trait `no-external` extends StObject
  @scala.inline
  def `no-external`: `no-external` = "no-external".asInstanceOf[`no-external`]
  
  @js.native
  sealed trait `no-treeshake` extends StObject
  @scala.inline
  def `no-treeshake`: `no-treeshake` = "no-treeshake".asInstanceOf[`no-treeshake`]
  
  @js.native
  sealed trait none extends StObject
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait options
    extends AsyncPluginHooks
       with SequentialPluginHooks
  @scala.inline
  def options: options = "options".asInstanceOf[options]
  
  @js.native
  sealed trait outputOptions
    extends SequentialPluginHooks
       with SyncPluginHooks
  @scala.inline
  def outputOptions: outputOptions = "outputOptions".asInstanceOf[outputOptions]
  
  @js.native
  sealed trait outro
    extends ParallelPluginHooks
       with PluginValueHooks
  @scala.inline
  def outro: outro = "outro".asInstanceOf[outro]
  
  @js.native
  sealed trait placeholder extends StObject
  @scala.inline
  def placeholder: placeholder = "placeholder".asInstanceOf[placeholder]
  
  @js.native
  sealed trait renderChunk
    extends AsyncPluginHooks
       with SequentialPluginHooks
  @scala.inline
  def renderChunk: renderChunk = "renderChunk".asInstanceOf[renderChunk]
  
  @js.native
  sealed trait renderDynamicImport
    extends FirstPluginHooks
       with SyncPluginHooks
  @scala.inline
  def renderDynamicImport: renderDynamicImport = "renderDynamicImport".asInstanceOf[renderDynamicImport]
  
  @js.native
  sealed trait renderError
    extends AsyncPluginHooks
       with ParallelPluginHooks
  @scala.inline
  def renderError: renderError = "renderError".asInstanceOf[renderError]
  
  @js.native
  sealed trait renderStart
    extends AsyncPluginHooks
       with ParallelPluginHooks
  @scala.inline
  def renderStart: renderStart = "renderStart".asInstanceOf[renderStart]
  
  @js.native
  sealed trait resolveAssetUrl
    extends FirstPluginHooks
       with SyncPluginHooks
  @scala.inline
  def resolveAssetUrl: resolveAssetUrl = "resolveAssetUrl".asInstanceOf[resolveAssetUrl]
  
  @js.native
  sealed trait resolveDynamicImport
    extends AsyncPluginHooks
       with FirstPluginHooks
  @scala.inline
  def resolveDynamicImport: resolveDynamicImport = "resolveDynamicImport".asInstanceOf[resolveDynamicImport]
  
  @js.native
  sealed trait resolveFileUrl
    extends FirstPluginHooks
       with SyncPluginHooks
  @scala.inline
  def resolveFileUrl: resolveFileUrl = "resolveFileUrl".asInstanceOf[resolveFileUrl]
  
  @js.native
  sealed trait resolveId
    extends AsyncPluginHooks
       with FirstPluginHooks
  @scala.inline
  def resolveId: resolveId = "resolveId".asInstanceOf[resolveId]
  
  @js.native
  sealed trait resolveImportMeta
    extends FirstPluginHooks
       with SyncPluginHooks
  @scala.inline
  def resolveImportMeta: resolveImportMeta = "resolveImportMeta".asInstanceOf[resolveImportMeta]
  
  @js.native
  sealed trait strict extends PreserveEntrySignaturesOption
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait system
    extends InternalModuleFormat
       with ModuleFormat
  @scala.inline
  def system: system = "system".asInstanceOf[system]
  
  @js.native
  sealed trait systemjs extends ModuleFormat
  @scala.inline
  def systemjs: systemjs = "systemjs".asInstanceOf[systemjs]
  
  @js.native
  sealed trait transform
    extends AsyncPluginHooks
       with SequentialPluginHooks
  @scala.inline
  def transform: transform = "transform".asInstanceOf[transform]
  
  @js.native
  sealed trait umd
    extends InternalModuleFormat
       with ModuleFormat
  @scala.inline
  def umd: umd = "umd".asInstanceOf[umd]
  
  @js.native
  sealed trait update extends ChangeEvent
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait watchChange
    extends SequentialPluginHooks
       with SyncPluginHooks
  @scala.inline
  def watchChange: watchChange = "watchChange".asInstanceOf[watchChange]
  
  @js.native
  sealed trait writeBundle
    extends AsyncPluginHooks
       with ParallelPluginHooks
  @scala.inline
  def writeBundle: writeBundle = "writeBundle".asInstanceOf[writeBundle]
}
