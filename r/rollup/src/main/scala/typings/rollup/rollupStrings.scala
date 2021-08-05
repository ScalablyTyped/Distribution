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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rollupStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with _InteropType
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait BUNDLE_END extends StObject
  inline def BUNDLE_END: BUNDLE_END = "BUNDLE_END".asInstanceOf[BUNDLE_END]
  
  @js.native
  sealed trait BUNDLE_START extends StObject
  inline def BUNDLE_START: BUNDLE_START = "BUNDLE_START".asInstanceOf[BUNDLE_START]
  
  @js.native
  sealed trait END extends StObject
  inline def END: END = "END".asInstanceOf[END]
  
  @js.native
  sealed trait ERROR extends StObject
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait PartialNull extends StObject
  inline def PartialNull: PartialNull = "PartialNull".asInstanceOf[PartialNull]
  
  @js.native
  sealed trait START extends StObject
  inline def START: START = "START".asInstanceOf[START]
  
  @js.native
  sealed trait _empty extends StObject
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait `allow-extension`
    extends StObject
       with PreserveEntrySignaturesOption
  inline def `allow-extension`: `allow-extension` = "allow-extension".asInstanceOf[`allow-extension`]
  
  @js.native
  sealed trait amd
    extends StObject
       with InternalModuleFormat
       with ModuleFormat
  inline def amd: amd = "amd".asInstanceOf[amd]
  
  @js.native
  sealed trait asset extends StObject
  inline def asset: asset = "asset".asInstanceOf[asset]
  
  @js.native
  sealed trait augmentChunkHash
    extends StObject
       with SequentialPluginHooks
       with SyncPluginHooks
  inline def augmentChunkHash: augmentChunkHash = "augmentChunkHash".asInstanceOf[augmentChunkHash]
  
  @js.native
  sealed trait auto
    extends StObject
       with _InteropType
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait banner
    extends StObject
       with ParallelPluginHooks
       with PluginValueHooks
  inline def banner: banner = "banner".asInstanceOf[banner]
  
  @js.native
  sealed trait buildEnd
    extends StObject
       with AsyncPluginHooks
       with ParallelPluginHooks
  inline def buildEnd: buildEnd = "buildEnd".asInstanceOf[buildEnd]
  
  @js.native
  sealed trait buildStart
    extends StObject
       with AsyncPluginHooks
       with ParallelPluginHooks
  inline def buildStart: buildStart = "buildStart".asInstanceOf[buildStart]
  
  @js.native
  sealed trait chunk extends StObject
  inline def chunk: chunk = "chunk".asInstanceOf[chunk]
  
  @js.native
  sealed trait cjs
    extends StObject
       with InternalModuleFormat
       with ModuleFormat
  inline def cjs: cjs = "cjs".asInstanceOf[cjs]
  
  @js.native
  sealed trait closeWatcher
    extends StObject
       with SequentialPluginHooks
       with SyncPluginHooks
  inline def closeWatcher: closeWatcher = "closeWatcher".asInstanceOf[closeWatcher]
  
  @js.native
  sealed trait commonjs
    extends StObject
       with ModuleFormat
  inline def commonjs: commonjs = "commonjs".asInstanceOf[commonjs]
  
  @js.native
  sealed trait create
    extends StObject
       with ChangeEvent
  inline def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait defaultOnly
    extends StObject
       with _InteropType
  inline def defaultOnly: defaultOnly = "defaultOnly".asInstanceOf[defaultOnly]
  
  @js.native
  sealed trait delete
    extends StObject
       with ChangeEvent
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait es
    extends StObject
       with InternalModuleFormat
       with ModuleFormat
  inline def es: es = "es".asInstanceOf[es]
  
  @js.native
  sealed trait esModule
    extends StObject
       with _InteropType
  inline def esModule: esModule = "esModule".asInstanceOf[esModule]
  
  @js.native
  sealed trait esm
    extends StObject
       with ModuleFormat
  inline def esm: esm = "esm".asInstanceOf[esm]
  
  @js.native
  sealed trait `exports-only`
    extends StObject
       with PreserveEntrySignaturesOption
  inline def `exports-only`: `exports-only` = "exports-only".asInstanceOf[`exports-only`]
  
  @js.native
  sealed trait footer
    extends StObject
       with ParallelPluginHooks
       with PluginValueHooks
  inline def footer: footer = "footer".asInstanceOf[footer]
  
  @js.native
  sealed trait generateBundle
    extends StObject
       with AsyncPluginHooks
       with SequentialPluginHooks
  inline def generateBundle: generateBundle = "generateBundle".asInstanceOf[generateBundle]
  
  @js.native
  sealed trait hidden extends StObject
  inline def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait iife
    extends StObject
       with InternalModuleFormat
       with ModuleFormat
  inline def iife: iife = "iife".asInstanceOf[iife]
  
  @js.native
  sealed trait `inline` extends StObject
  inline def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @js.native
  sealed trait intro
    extends StObject
       with ParallelPluginHooks
       with PluginValueHooks
  inline def intro: intro = "intro".asInstanceOf[intro]
  
  @js.native
  sealed trait load
    extends StObject
       with AsyncPluginHooks
       with FirstPluginHooks
  inline def load: load = "load".asInstanceOf[load]
  
  @js.native
  sealed trait module
    extends StObject
       with ModuleFormat
  inline def module: module = "module".asInstanceOf[module]
  
  @js.native
  sealed trait moduleParsed
    extends StObject
       with AsyncPluginHooks
       with ParallelPluginHooks
  inline def moduleParsed: moduleParsed = "moduleParsed".asInstanceOf[moduleParsed]
  
  @js.native
  sealed trait named extends StObject
  inline def named: named = "named".asInstanceOf[named]
  
  @js.native
  sealed trait `no-external` extends StObject
  inline def `no-external`: `no-external` = "no-external".asInstanceOf[`no-external`]
  
  @js.native
  sealed trait `no-treeshake` extends StObject
  inline def `no-treeshake`: `no-treeshake` = "no-treeshake".asInstanceOf[`no-treeshake`]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait options
    extends StObject
       with AsyncPluginHooks
       with SequentialPluginHooks
  inline def options: options = "options".asInstanceOf[options]
  
  @js.native
  sealed trait outputOptions
    extends StObject
       with SequentialPluginHooks
       with SyncPluginHooks
  inline def outputOptions: outputOptions = "outputOptions".asInstanceOf[outputOptions]
  
  @js.native
  sealed trait outro
    extends StObject
       with ParallelPluginHooks
       with PluginValueHooks
  inline def outro: outro = "outro".asInstanceOf[outro]
  
  @js.native
  sealed trait placeholder extends StObject
  inline def placeholder: placeholder = "placeholder".asInstanceOf[placeholder]
  
  @js.native
  sealed trait renderChunk
    extends StObject
       with AsyncPluginHooks
       with SequentialPluginHooks
  inline def renderChunk: renderChunk = "renderChunk".asInstanceOf[renderChunk]
  
  @js.native
  sealed trait renderDynamicImport
    extends StObject
       with FirstPluginHooks
       with SyncPluginHooks
  inline def renderDynamicImport: renderDynamicImport = "renderDynamicImport".asInstanceOf[renderDynamicImport]
  
  @js.native
  sealed trait renderError
    extends StObject
       with AsyncPluginHooks
       with ParallelPluginHooks
  inline def renderError: renderError = "renderError".asInstanceOf[renderError]
  
  @js.native
  sealed trait renderStart
    extends StObject
       with AsyncPluginHooks
       with ParallelPluginHooks
  inline def renderStart: renderStart = "renderStart".asInstanceOf[renderStart]
  
  @js.native
  sealed trait resolveAssetUrl
    extends StObject
       with FirstPluginHooks
       with SyncPluginHooks
  inline def resolveAssetUrl: resolveAssetUrl = "resolveAssetUrl".asInstanceOf[resolveAssetUrl]
  
  @js.native
  sealed trait resolveDynamicImport
    extends StObject
       with AsyncPluginHooks
       with FirstPluginHooks
  inline def resolveDynamicImport: resolveDynamicImport = "resolveDynamicImport".asInstanceOf[resolveDynamicImport]
  
  @js.native
  sealed trait resolveFileUrl
    extends StObject
       with FirstPluginHooks
       with SyncPluginHooks
  inline def resolveFileUrl: resolveFileUrl = "resolveFileUrl".asInstanceOf[resolveFileUrl]
  
  @js.native
  sealed trait resolveId
    extends StObject
       with AsyncPluginHooks
       with FirstPluginHooks
  inline def resolveId: resolveId = "resolveId".asInstanceOf[resolveId]
  
  @js.native
  sealed trait resolveImportMeta
    extends StObject
       with FirstPluginHooks
       with SyncPluginHooks
  inline def resolveImportMeta: resolveImportMeta = "resolveImportMeta".asInstanceOf[resolveImportMeta]
  
  @js.native
  sealed trait strict
    extends StObject
       with PreserveEntrySignaturesOption
  inline def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait system
    extends StObject
       with InternalModuleFormat
       with ModuleFormat
  inline def system: system = "system".asInstanceOf[system]
  
  @js.native
  sealed trait systemjs
    extends StObject
       with ModuleFormat
  inline def systemjs: systemjs = "systemjs".asInstanceOf[systemjs]
  
  @js.native
  sealed trait transform
    extends StObject
       with AsyncPluginHooks
       with SequentialPluginHooks
  inline def transform: transform = "transform".asInstanceOf[transform]
  
  @js.native
  sealed trait umd
    extends StObject
       with InternalModuleFormat
       with ModuleFormat
  inline def umd: umd = "umd".asInstanceOf[umd]
  
  @js.native
  sealed trait update
    extends StObject
       with ChangeEvent
  inline def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait watchChange
    extends StObject
       with SequentialPluginHooks
       with SyncPluginHooks
  inline def watchChange: watchChange = "watchChange".asInstanceOf[watchChange]
  
  @js.native
  sealed trait writeBundle
    extends StObject
       with AsyncPluginHooks
       with ParallelPluginHooks
  inline def writeBundle: writeBundle = "writeBundle".asInstanceOf[writeBundle]
}
