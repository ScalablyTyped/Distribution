package typings.protractor

import typings.protractor.configMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protractor/built/configParser", JSImport.Namespace)
@js.native
object configParserMod extends js.Object {
  
  @js.native
  class ConfigParser () extends js.Object {
    
    /**
      * Public function specialized towards merging in config from argv
      *
      * @public
      * @param {Object} argv
      */
    def addConfig(argv: js.Any): ConfigParser = js.native
    
    /**
      * Add the options in the parameter config to this runner instance.
      *
      * @private
      * @param {Object} additionalConfig
      * @param {string} relativeTo the file path to resolve paths against
      */
    /* private */ def addConfig_(additionalConfig: js.Any, relativeTo: js.Any): js.Any = js.native
    
    /**
      * Public function specialized towards merging in a file's config
      *
      * @public
      * @param {String} filename
      */
    def addFileConfig(filename: String): ConfigParser = js.native
    
    var config_ : js.Any = js.native
    
    /**
      * Public getter for the final, computed config object
      *
      * @public
      * @return {Object} config
      */
    def getConfig(): Config = js.native
  }
  /* static members */
  @js.native
  object ConfigParser extends js.Object {
    
    /**
      * Returns only the specs that should run currently based on `config.suite`
      *
      * @return {Array} An array of globs locating the spec files
      */
    def getSpecs(config: Config): js.Array[String] = js.native
    
    def resolveFilePatterns(patterns: String): js.Array[String] = js.native
    def resolveFilePatterns(patterns: String, opt_omitWarnings: js.UndefOr[scala.Nothing], opt_relativeTo: String): js.Array[String] = js.native
    def resolveFilePatterns(patterns: String, opt_omitWarnings: Boolean): js.Array[String] = js.native
    def resolveFilePatterns(patterns: String, opt_omitWarnings: Boolean, opt_relativeTo: String): js.Array[String] = js.native
    /**
      * Resolve a list of file patterns into a list of individual file paths.
      *
      * @param {Array.<string> | string} patterns
      * @param {=boolean} opt_omitWarnings Whether to omit did not match warnings
      * @param {=string} opt_relativeTo Path to resolve patterns against
      *
      * @return {Array} The resolved file paths.
      */
    def resolveFilePatterns(patterns: js.Array[String]): js.Array[String] = js.native
    def resolveFilePatterns(patterns: js.Array[String], opt_omitWarnings: js.UndefOr[scala.Nothing], opt_relativeTo: String): js.Array[String] = js.native
    def resolveFilePatterns(patterns: js.Array[String], opt_omitWarnings: Boolean): js.Array[String] = js.native
    def resolveFilePatterns(patterns: js.Array[String], opt_omitWarnings: Boolean, opt_relativeTo: String): js.Array[String] = js.native
  }
}
