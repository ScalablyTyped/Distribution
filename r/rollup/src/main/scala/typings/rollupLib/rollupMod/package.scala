package typings
package rollupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rollupMod {
  type AddonHook = java.lang.String | (js.ThisFunction0[/* this */ PluginContext, java.lang.String | stdLib.Promise[java.lang.String]])
  type ExternalOption = js.Array[java.lang.String] | IsExternal
  type GlobalsOption = ScalablyTyped.runtime.StringDictionary[java.lang.String] | (js.Function1[/* name */ java.lang.String, java.lang.String])
  type InputOption = java.lang.String | js.Array[java.lang.String] | ScalablyTyped.runtime.StringDictionary[java.lang.String]
  type IsExternal = js.Function3[
    /* id */ java.lang.String, 
    /* parentId */ java.lang.String, 
    /* isResolved */ scala.Boolean, 
    scala.Boolean | scala.Unit
  ]
  type LoadHook = js.ThisFunction1[
    /* this */ PluginContext, 
    /* id */ java.lang.String, 
    (stdLib.Promise[SourceDescription | java.lang.String | scala.Unit | scala.Null]) | SourceDescription | java.lang.String | scala.Unit | scala.Null
  ]
  type ModuleFormat = rollupLib.rollupLibStrings.amd | rollupLib.rollupLibStrings.cjs | rollupLib.rollupLibStrings.system | rollupLib.rollupLibStrings.es | rollupLib.rollupLibStrings.esm | rollupLib.rollupLibStrings.iife | rollupLib.rollupLibStrings.umd
  type OptionsPaths = (stdLib.Record[java.lang.String, java.lang.String]) | (js.Function1[/* id */ java.lang.String, java.lang.String])
  type OutputFile = java.lang.String | nodeLib.Buffer | OutputChunk
  type PluginImpl[O /* <: js.Object */] = js.Function1[/* options */ js.UndefOr[O], Plugin]
  type RawSourceMap = rollupLib.Anon_Mappings | ExistingRawSourceMap
  type RenderChunkHook = js.ThisFunction3[
    /* this */ PluginContext, 
    /* code */ java.lang.String, 
    /* chunk */ RenderedChunk, 
    /* options */ OutputOptions, 
    (stdLib.Promise[rollupLib.Anon_Code | scala.Unit]) | rollupLib.Anon_Code | scala.Unit | scala.Null
  ]
  type ResolveDynamicImportHook = js.ThisFunction2[
    /* this */ PluginContext, 
    /* specifier */ java.lang.String | estreeLib.estreeMod.Node, 
    /* parentId */ java.lang.String, 
    (stdLib.Promise[java.lang.String | scala.Unit]) | java.lang.String | scala.Unit
  ]
  type ResolveIdHook = js.ThisFunction2[
    /* this */ PluginContext, 
    /* id */ java.lang.String, 
    /* parent */ java.lang.String, 
    (stdLib.Promise[java.lang.String | scala.Boolean | scala.Unit | scala.Null]) | java.lang.String | scala.Boolean | scala.Unit | scala.Null
  ]
  type TransformChunkHook = js.ThisFunction2[
    /* this */ PluginContext, 
    /* code */ java.lang.String, 
    /* options */ OutputOptions, 
    (stdLib.Promise[rollupLib.Anon_Code | scala.Unit]) | rollupLib.Anon_Code | scala.Unit | scala.Null
  ]
  type TransformHook = js.ThisFunction2[
    /* this */ PluginContext, 
    /* code */ java.lang.String, 
    /* id */ java.lang.String, 
    (stdLib.Promise[TransformSourceDescription | java.lang.String | scala.Unit]) | TransformSourceDescription | java.lang.String | scala.Unit
  ]
  type WarningHandler = js.Function1[/* warning */ java.lang.String | RollupWarning, scala.Unit]
  type Watcher = nodeLib.eventsMod.EventEmitter
}
