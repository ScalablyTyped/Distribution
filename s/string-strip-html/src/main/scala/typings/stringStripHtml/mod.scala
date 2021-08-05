package typings.stringStripHtml

import typings.stringStripHtml.anon.LimitLinebreaksCount
import typings.stringStripHtml.stringStripHtmlBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(str: String): Output = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[Output]
  inline def apply(str: String, originalOpts: Options): Output = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], originalOpts.asInstanceOf[js.Any])).asInstanceOf[Output]
  
  @JSImport("string-strip-html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CallbackInput extends StObject {
    
    /** The index in the input string to start deleting from */
    var deleteFrom: Double
    
    /** The index in the input string to stop deleting */
    var deleteTo: Double
    
    /** The string to replace the tag with */
    var insert: String
    
    /**
      * The value returned by the default strip function.
      *
      * [deleteFrom, deleteTo, insert]
      */
    var proposedReturn: js.Tuple3[Double, Double, js.UndefOr[String]]
    
    /** The range configuration */
    var rangesArr: Range
    
    /** The HTML tag found */
    var tag: Tag
  }
  object CallbackInput {
    
    inline def apply(
      deleteFrom: Double,
      deleteTo: Double,
      insert: String,
      proposedReturn: js.Tuple3[Double, Double, js.UndefOr[String]],
      rangesArr: Range,
      tag: Tag
    ): CallbackInput = {
      val __obj = js.Dynamic.literal(deleteFrom = deleteFrom.asInstanceOf[js.Any], deleteTo = deleteTo.asInstanceOf[js.Any], insert = insert.asInstanceOf[js.Any], proposedReturn = proposedReturn.asInstanceOf[js.Any], rangesArr = rangesArr.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallbackInput]
    }
    
    extension [Self <: CallbackInput](x: Self) {
      
      inline def setDeleteFrom(value: Double): Self = StObject.set(x, "deleteFrom", value.asInstanceOf[js.Any])
      
      inline def setDeleteTo(value: Double): Self = StObject.set(x, "deleteTo", value.asInstanceOf[js.Any])
      
      inline def setInsert(value: String): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setProposedReturn(value: js.Tuple3[Double, Double, js.UndefOr[String]]): Self = StObject.set(x, "proposedReturn", value.asInstanceOf[js.Any])
      
      inline def setRangesArr(value: Range): Self = StObject.set(x, "rangesArr", value.asInstanceOf[js.Any])
      
      inline def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait DumpLinkHrefsNearby extends StObject {
    
    /**
      * By default, this function is disabled - URL's are not inserted nearby.
      *
      * Set it to Boolean true to enable it.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, URL is inserted after any whatever was left after stripping the particular linked piece of code.
      * If you want, you can force all inserted URL's to be on a new line, separated by a blank line.
      */
    var putOnNewLine: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This string (default is an empty string) will be inserted in front of every URL.
      *
      * Set it to any string you want, for example [.
      */
    var wrapHeads: js.UndefOr[String] = js.undefined
    
    /**
      * This string (default is an empty string) will be inserted straight after every URL.
      *
      * Set it to any string you want, for example ].
      */
    var wrapTails: js.UndefOr[String] = js.undefined
  }
  object DumpLinkHrefsNearby {
    
    inline def apply(): DumpLinkHrefsNearby = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DumpLinkHrefsNearby]
    }
    
    extension [Self <: DumpLinkHrefsNearby](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setPutOnNewLine(value: Boolean): Self = StObject.set(x, "putOnNewLine", value.asInstanceOf[js.Any])
      
      inline def setPutOnNewLineUndefined: Self = StObject.set(x, "putOnNewLine", js.undefined)
      
      inline def setWrapHeads(value: String): Self = StObject.set(x, "wrapHeads", value.asInstanceOf[js.Any])
      
      inline def setWrapHeadsUndefined: Self = StObject.set(x, "wrapHeads", js.undefined)
      
      inline def setWrapTails(value: String): Self = StObject.set(x, "wrapTails", value.asInstanceOf[js.Any])
      
      inline def setWrapTailsUndefined: Self = StObject.set(x, "wrapTails", js.undefined)
    }
  }
  
  trait Log extends StObject {
    
    var timeTakenInMilliseconds: Double
  }
  object Log {
    
    inline def apply(timeTakenInMilliseconds: Double): Log = {
      val __obj = js.Dynamic.literal(timeTakenInMilliseconds = timeTakenInMilliseconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Log]
    }
    
    extension [Self <: Log](x: Self) {
      
      inline def setTimeTakenInMilliseconds(value: Double): Self = StObject.set(x, "timeTakenInMilliseconds", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * The function to call to control the strip behaviour.
      *
      * Gives you full control of the output and lets you tweak it.
      * See the dedicated chapter below called "opts.cb" with explanation and examples.
      */
    var cb: js.UndefOr[js.Function1[/* input */ CallbackInput, Unit | Null | `false`]] = js.undefined
    
    /** Used to customise the output of link URL's: to enable the feature, also customise the URL location and wrapping. */
    var dumpLinkHrefsNearby: js.UndefOr[DumpLinkHrefsNearby | `false`] = js.undefined
    
    /** These tags will not be removed */
    var ignoreTags: js.UndefOr[js.Array[String]] = js.undefined
    
    /** If one or more tag names are given here, only these tags will be stripped, nothing else */
    var onlyStripTags: js.UndefOr[js.Array[String]] = js.undefined
    
    /** By default, all escaped HTML entities for example &pound; input will be recursively decoded before HTML-stripping. You can turn it off here if you don't need it. */
    var skipHtmlDecoding: js.UndefOr[Boolean] = js.undefined
    
    /** These tags will be removed from the opening tag up to closing tag, including content in-between opening and closing tags. Set it to something falsey to turn it off. */
    var stripTogetherWithTheirContents: js.UndefOr[js.Array[String] | `false`] = js.undefined
    
    /** Used mainly in automated setups. It ensures non-spaces are not trimmed from the outer edges of a string. */
    var trimOnlySpaces: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCb(value: /* input */ CallbackInput => Unit | Null | `false`): Self = StObject.set(x, "cb", js.Any.fromFunction1(value))
      
      inline def setCbUndefined: Self = StObject.set(x, "cb", js.undefined)
      
      inline def setDumpLinkHrefsNearby(value: DumpLinkHrefsNearby | `false`): Self = StObject.set(x, "dumpLinkHrefsNearby", value.asInstanceOf[js.Any])
      
      inline def setDumpLinkHrefsNearbyUndefined: Self = StObject.set(x, "dumpLinkHrefsNearby", js.undefined)
      
      inline def setIgnoreTags(value: js.Array[String]): Self = StObject.set(x, "ignoreTags", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTagsUndefined: Self = StObject.set(x, "ignoreTags", js.undefined)
      
      inline def setIgnoreTagsVarargs(value: String*): Self = StObject.set(x, "ignoreTags", js.Array(value :_*))
      
      inline def setOnlyStripTags(value: js.Array[String]): Self = StObject.set(x, "onlyStripTags", value.asInstanceOf[js.Any])
      
      inline def setOnlyStripTagsUndefined: Self = StObject.set(x, "onlyStripTags", js.undefined)
      
      inline def setOnlyStripTagsVarargs(value: String*): Self = StObject.set(x, "onlyStripTags", js.Array(value :_*))
      
      inline def setSkipHtmlDecoding(value: Boolean): Self = StObject.set(x, "skipHtmlDecoding", value.asInstanceOf[js.Any])
      
      inline def setSkipHtmlDecodingUndefined: Self = StObject.set(x, "skipHtmlDecoding", js.undefined)
      
      inline def setStripTogetherWithTheirContents(value: js.Array[String] | `false`): Self = StObject.set(x, "stripTogetherWithTheirContents", value.asInstanceOf[js.Any])
      
      inline def setStripTogetherWithTheirContentsUndefined: Self = StObject.set(x, "stripTogetherWithTheirContents", js.undefined)
      
      inline def setStripTogetherWithTheirContentsVarargs(value: String*): Self = StObject.set(x, "stripTogetherWithTheirContents", js.Array(value :_*))
      
      inline def setTrimOnlySpaces(value: Boolean): Self = StObject.set(x, "trimOnlySpaces", value.asInstanceOf[js.Any])
      
      inline def setTrimOnlySpacesUndefined: Self = StObject.set(x, "trimOnlySpaces", js.undefined)
    }
  }
  
  trait Output extends StObject {
    
    /**
      * Array of zero or more arrays
      *
      * For example, [[0, 5], [30, 35]]. If you String.slice() each pair, you'll get HTML tag values.
      */
    var allTagLocations: js.Array[js.Tuple2[Double, Double]]
    
    /**
      * Array of zero or more arrays
      *
      * Only the tags that ended up stripped will be reported here.
      * Takes into account opts.ignoreTags and opts.onlyStripTags, unlike allTagLocations above. For example, [[0, 5], [30, 35]].
      */
    var filteredTagLocations: js.Array[js.Tuple2[Double, Double]]
    
    /**
      * Plain object
      *
      * For example, { timeTakenInMilliseconds: 6 }
      */
    var log: Log
    
    /**
      * Array of one or more string range arrays OR null
      *
      * For example, if characters from index 0 to 5 and 30 to 35 were deleted, that would be [[0, 5], [30, 35]]
      */
    var ranges: (js.Array[js.Tuple3[Double, Double, js.UndefOr[String]]]) | Null
    
    /** The string version where all ranges were applied to it. */
    var result: String
  }
  object Output {
    
    inline def apply(
      allTagLocations: js.Array[js.Tuple2[Double, Double]],
      filteredTagLocations: js.Array[js.Tuple2[Double, Double]],
      log: Log,
      result: String
    ): Output = {
      val __obj = js.Dynamic.literal(allTagLocations = allTagLocations.asInstanceOf[js.Any], filteredTagLocations = filteredTagLocations.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], ranges = null)
      __obj.asInstanceOf[Output]
    }
    
    extension [Self <: Output](x: Self) {
      
      inline def setAllTagLocations(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "allTagLocations", value.asInstanceOf[js.Any])
      
      inline def setAllTagLocationsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "allTagLocations", js.Array(value :_*))
      
      inline def setFilteredTagLocations(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "filteredTagLocations", value.asInstanceOf[js.Any])
      
      inline def setFilteredTagLocationsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "filteredTagLocations", js.Array(value :_*))
      
      inline def setLog(value: Log): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setRanges(value: js.Array[js.Tuple3[Double, Double, js.UndefOr[String]]]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesNull: Self = StObject.set(x, "ranges", null)
      
      inline def setRangesVarargs(value: (js.Tuple3[Double, Double, js.UndefOr[String]])*): Self = StObject.set(x, "ranges", js.Array(value :_*))
      
      inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Range extends StObject {
    
    var opts: LimitLinebreaksCount
  }
  object Range {
    
    inline def apply(opts: LimitLinebreaksCount): Range = {
      val __obj = js.Dynamic.literal(opts = opts.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    extension [Self <: Range](x: Self) {
      
      inline def setOpts(value: LimitLinebreaksCount): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tag extends StObject {
    
    var attributes: js.Array[TagAttribute]
    
    var lastClosingBracketAt: Double
    
    var lastOpeningBracketAt: Double
    
    var leftOuterWhitespace: Double
    
    var name: String
    
    var nameContainsLetters: Boolean
    
    var nameEnds: Double
    
    var nameStarts: Double
    
    var onlyPlausible: Boolean
    
    var slashPresent: Boolean
  }
  object Tag {
    
    inline def apply(
      attributes: js.Array[TagAttribute],
      lastClosingBracketAt: Double,
      lastOpeningBracketAt: Double,
      leftOuterWhitespace: Double,
      name: String,
      nameContainsLetters: Boolean,
      nameEnds: Double,
      nameStarts: Double,
      onlyPlausible: Boolean,
      slashPresent: Boolean
    ): Tag = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], lastClosingBracketAt = lastClosingBracketAt.asInstanceOf[js.Any], lastOpeningBracketAt = lastOpeningBracketAt.asInstanceOf[js.Any], leftOuterWhitespace = leftOuterWhitespace.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameContainsLetters = nameContainsLetters.asInstanceOf[js.Any], nameEnds = nameEnds.asInstanceOf[js.Any], nameStarts = nameStarts.asInstanceOf[js.Any], onlyPlausible = onlyPlausible.asInstanceOf[js.Any], slashPresent = slashPresent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    extension [Self <: Tag](x: Self) {
      
      inline def setAttributes(value: js.Array[TagAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: TagAttribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      inline def setLastClosingBracketAt(value: Double): Self = StObject.set(x, "lastClosingBracketAt", value.asInstanceOf[js.Any])
      
      inline def setLastOpeningBracketAt(value: Double): Self = StObject.set(x, "lastOpeningBracketAt", value.asInstanceOf[js.Any])
      
      inline def setLeftOuterWhitespace(value: Double): Self = StObject.set(x, "leftOuterWhitespace", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameContainsLetters(value: Boolean): Self = StObject.set(x, "nameContainsLetters", value.asInstanceOf[js.Any])
      
      inline def setNameEnds(value: Double): Self = StObject.set(x, "nameEnds", value.asInstanceOf[js.Any])
      
      inline def setNameStarts(value: Double): Self = StObject.set(x, "nameStarts", value.asInstanceOf[js.Any])
      
      inline def setOnlyPlausible(value: Boolean): Self = StObject.set(x, "onlyPlausible", value.asInstanceOf[js.Any])
      
      inline def setSlashPresent(value: Boolean): Self = StObject.set(x, "slashPresent", value.asInstanceOf[js.Any])
    }
  }
  
  trait TagAttribute extends StObject {
    
    var equalsAt: Double
    
    var name: String
    
    var nameEnds: Double
    
    var nameStarts: Double
    
    var value: String
    
    var valueEnds: Double
    
    var valueStarts: Double
  }
  object TagAttribute {
    
    inline def apply(
      equalsAt: Double,
      name: String,
      nameEnds: Double,
      nameStarts: Double,
      value: String,
      valueEnds: Double,
      valueStarts: Double
    ): TagAttribute = {
      val __obj = js.Dynamic.literal(equalsAt = equalsAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameEnds = nameEnds.asInstanceOf[js.Any], nameStarts = nameStarts.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueEnds = valueEnds.asInstanceOf[js.Any], valueStarts = valueStarts.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagAttribute]
    }
    
    extension [Self <: TagAttribute](x: Self) {
      
      inline def setEqualsAt(value: Double): Self = StObject.set(x, "equalsAt", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameEnds(value: Double): Self = StObject.set(x, "nameEnds", value.asInstanceOf[js.Any])
      
      inline def setNameStarts(value: Double): Self = StObject.set(x, "nameStarts", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueEnds(value: Double): Self = StObject.set(x, "valueEnds", value.asInstanceOf[js.Any])
      
      inline def setValueStarts(value: Double): Self = StObject.set(x, "valueStarts", value.asInstanceOf[js.Any])
    }
  }
}
