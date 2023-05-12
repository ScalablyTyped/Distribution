package typings.sourcemapValidator

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Validate source maps.
    *
    * @param minifiedCode Your minified code.
    * @param sourceMap Your sourcemap as a JSON string. If left empty, the inline sourcemap in `minifiedCode` will be used.
    * @param sourceContent A map to the raw source files. If left empty, the inline `sourceContent` in `sourceMap` will be used.
    *
    * @example
    * import validate = require('sourcemap-validator');
    * import * as fs from 'fs';
    * import * as assert from 'assert';
    *
    * const min = fs.readFileSync('jquery.min.js', 'utf-8');
    * const map = fs.readFileSync('jquery.min.map', 'utf-8');
    * const raw = fs.readFileSync('jquery.js', 'utf-8');
    *
    * assert.doesNotThrow(() => {
    *   validate(min, map, {'jquery.js': raw});
    * }, 'The sourcemap is not valid');
    *
    * const browserifyBundleMin = fs.readFileSync('bundle.min.js', 'utf-8');
    * const browserifyBundleMap = fs.readFileSync('bundle.min.map', 'utf-8');
    *
    * // Browserify bundles have inline sourceContent in their maps
    * // so no need to pass a `sourceContent` object.
    * assert.doesNotThrow(() => {
    *   validate(browserifyBundleMin, browserifyBundleMap);
    * }, 'The sourcemap is not valid');
    */
  inline def apply(minifiedCode: String): Unit = ^.asInstanceOf[js.Dynamic].apply(minifiedCode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(minifiedCode: String, sourceMap: String): Unit = (^.asInstanceOf[js.Dynamic].apply(minifiedCode.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(minifiedCode: String, sourceMap: String, sourceContent: Record[String, String]): Unit = (^.asInstanceOf[js.Dynamic].apply(minifiedCode.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], sourceContent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(minifiedCode: String, sourceMap: Unit, sourceContent: Record[String, String]): Unit = (^.asInstanceOf[js.Dynamic].apply(minifiedCode.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], sourceContent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sourcemap-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
