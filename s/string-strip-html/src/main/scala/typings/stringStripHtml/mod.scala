package typings.stringStripHtml

import typings.stringStripHtml.anon.LimitLinebreaksCount
import typings.stringStripHtml.stringStripHtmlBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("string-strip-html", JSImport.Namespace)
  @js.native
  def apply(str: String): Output = js.native
  @JSImport("string-strip-html", JSImport.Namespace)
  @js.native
  def apply(str: String, originalOpts: Options): Output = js.native
  
  @js.native
  trait CallbackInput extends StObject {
    
    /** The index in the input string to start deleting from */
    var deleteFrom: Double = js.native
    
    /** The index in the input string to stop deleting */
    var deleteTo: Double = js.native
    
    /** The string to replace the tag with */
    var insert: String = js.native
    
    /**
      * The value returned by the default strip function.
      *
      * [deleteFrom, deleteTo, insert]
      */
    var proposedReturn: js.Tuple3[Double, Double, js.UndefOr[String]] = js.native
    
    /** The range configuration */
    var rangesArr: Range = js.native
    
    /** The HTML tag found */
    var tag: Tag = js.native
  }
  object CallbackInput {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CallbackInputMutableBuilder[Self <: CallbackInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleteFrom(value: Double): Self = StObject.set(x, "deleteFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteTo(value: Double): Self = StObject.set(x, "deleteTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsert(value: String): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProposedReturn(value: js.Tuple3[Double, Double, js.UndefOr[String]]): Self = StObject.set(x, "proposedReturn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangesArr(value: Range): Self = StObject.set(x, "rangesArr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DumpLinkHrefsNearby extends StObject {
    
    /**
      * By default, this function is disabled - URL's are not inserted nearby.
      *
      * Set it to Boolean true to enable it.
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * By default, URL is inserted after any whatever was left after stripping the particular linked piece of code.
      * If you want, you can force all inserted URL's to be on a new line, separated by a blank line.
      */
    var putOnNewLine: js.UndefOr[Boolean] = js.native
    
    /**
      * This string (default is an empty string) will be inserted in front of every URL.
      *
      * Set it to any string you want, for example [.
      */
    var wrapHeads: js.UndefOr[String] = js.native
    
    /**
      * This string (default is an empty string) will be inserted straight after every URL.
      *
      * Set it to any string you want, for example ].
      */
    var wrapTails: js.UndefOr[String] = js.native
  }
  object DumpLinkHrefsNearby {
    
    @scala.inline
    def apply(): DumpLinkHrefsNearby = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DumpLinkHrefsNearby]
    }
    
    @scala.inline
    implicit class DumpLinkHrefsNearbyMutableBuilder[Self <: DumpLinkHrefsNearby] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setPutOnNewLine(value: Boolean): Self = StObject.set(x, "putOnNewLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPutOnNewLineUndefined: Self = StObject.set(x, "putOnNewLine", js.undefined)
      
      @scala.inline
      def setWrapHeads(value: String): Self = StObject.set(x, "wrapHeads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapHeadsUndefined: Self = StObject.set(x, "wrapHeads", js.undefined)
      
      @scala.inline
      def setWrapTails(value: String): Self = StObject.set(x, "wrapTails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapTailsUndefined: Self = StObject.set(x, "wrapTails", js.undefined)
    }
  }
  
  @js.native
  trait Log extends StObject {
    
    var timeTakenInMilliseconds: Double = js.native
  }
  object Log {
    
    @scala.inline
    def apply(timeTakenInMilliseconds: Double): Log = {
      val __obj = js.Dynamic.literal(timeTakenInMilliseconds = timeTakenInMilliseconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Log]
    }
    
    @scala.inline
    implicit class LogMutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeTakenInMilliseconds(value: Double): Self = StObject.set(x, "timeTakenInMilliseconds", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The function to call to control the strip behaviour.
      *
      * Gives you full control of the output and lets you tweak it.
      * See the dedicated chapter below called "opts.cb" with explanation and examples.
      */
    var cb: js.UndefOr[js.Function1[/* input */ CallbackInput, Unit | Null | `false`]] = js.native
    
    /** Used to customise the output of link URL's: to enable the feature, also customise the URL location and wrapping. */
    var dumpLinkHrefsNearby: js.UndefOr[DumpLinkHrefsNearby | `false`] = js.native
    
    /** These tags will not be removed */
    var ignoreTags: js.UndefOr[js.Array[String]] = js.native
    
    /** If one or more tag names are given here, only these tags will be stripped, nothing else */
    var onlyStripTags: js.UndefOr[js.Array[String]] = js.native
    
    /** By default, all escaped HTML entities for example &pound; input will be recursively decoded before HTML-stripping. You can turn it off here if you don't need it. */
    var skipHtmlDecoding: js.UndefOr[Boolean] = js.native
    
    /** These tags will be removed from the opening tag up to closing tag, including content in-between opening and closing tags. Set it to something falsey to turn it off. */
    var stripTogetherWithTheirContents: js.UndefOr[js.Array[String] | `false`] = js.native
    
    /** Used mainly in automated setups. It ensures non-spaces are not trimmed from the outer edges of a string. */
    var trimOnlySpaces: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCb(value: /* input */ CallbackInput => Unit | Null | `false`): Self = StObject.set(x, "cb", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCbUndefined: Self = StObject.set(x, "cb", js.undefined)
      
      @scala.inline
      def setDumpLinkHrefsNearby(value: DumpLinkHrefsNearby | `false`): Self = StObject.set(x, "dumpLinkHrefsNearby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDumpLinkHrefsNearbyUndefined: Self = StObject.set(x, "dumpLinkHrefsNearby", js.undefined)
      
      @scala.inline
      def setIgnoreTags(value: js.Array[String]): Self = StObject.set(x, "ignoreTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreTagsUndefined: Self = StObject.set(x, "ignoreTags", js.undefined)
      
      @scala.inline
      def setIgnoreTagsVarargs(value: String*): Self = StObject.set(x, "ignoreTags", js.Array(value :_*))
      
      @scala.inline
      def setOnlyStripTags(value: js.Array[String]): Self = StObject.set(x, "onlyStripTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyStripTagsUndefined: Self = StObject.set(x, "onlyStripTags", js.undefined)
      
      @scala.inline
      def setOnlyStripTagsVarargs(value: String*): Self = StObject.set(x, "onlyStripTags", js.Array(value :_*))
      
      @scala.inline
      def setSkipHtmlDecoding(value: Boolean): Self = StObject.set(x, "skipHtmlDecoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipHtmlDecodingUndefined: Self = StObject.set(x, "skipHtmlDecoding", js.undefined)
      
      @scala.inline
      def setStripTogetherWithTheirContents(value: js.Array[String] | `false`): Self = StObject.set(x, "stripTogetherWithTheirContents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripTogetherWithTheirContentsUndefined: Self = StObject.set(x, "stripTogetherWithTheirContents", js.undefined)
      
      @scala.inline
      def setStripTogetherWithTheirContentsVarargs(value: String*): Self = StObject.set(x, "stripTogetherWithTheirContents", js.Array(value :_*))
      
      @scala.inline
      def setTrimOnlySpaces(value: Boolean): Self = StObject.set(x, "trimOnlySpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimOnlySpacesUndefined: Self = StObject.set(x, "trimOnlySpaces", js.undefined)
    }
  }
  
  @js.native
  trait Output extends StObject {
    
    /**
      * Array of zero or more arrays
      *
      * For example, [[0, 5], [30, 35]]. If you String.slice() each pair, you'll get HTML tag values.
      */
    var allTagLocations: js.Array[js.Tuple2[Double, Double]] = js.native
    
    /**
      * Array of zero or more arrays
      *
      * Only the tags that ended up stripped will be reported here.
      * Takes into account opts.ignoreTags and opts.onlyStripTags, unlike allTagLocations above. For example, [[0, 5], [30, 35]].
      */
    var filteredTagLocations: js.Array[js.Tuple2[Double, Double]] = js.native
    
    /**
      * Plain object
      *
      * For example, { timeTakenInMilliseconds: 6 }
      */
    var log: Log = js.native
    
    /**
      * Array of one or more string range arrays OR null
      *
      * For example, if characters from index 0 to 5 and 30 to 35 were deleted, that would be [[0, 5], [30, 35]]
      */
    var ranges: (js.Array[js.Tuple3[Double, Double, js.UndefOr[String]]]) | Null = js.native
    
    /** The string version where all ranges were applied to it. */
    var result: String = js.native
  }
  object Output {
    
    @scala.inline
    def apply(
      allTagLocations: js.Array[js.Tuple2[Double, Double]],
      filteredTagLocations: js.Array[js.Tuple2[Double, Double]],
      log: Log,
      result: String
    ): Output = {
      val __obj = js.Dynamic.literal(allTagLocations = allTagLocations.asInstanceOf[js.Any], filteredTagLocations = filteredTagLocations.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    @scala.inline
    implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllTagLocations(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "allTagLocations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllTagLocationsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "allTagLocations", js.Array(value :_*))
      
      @scala.inline
      def setFilteredTagLocations(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "filteredTagLocations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredTagLocationsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "filteredTagLocations", js.Array(value :_*))
      
      @scala.inline
      def setLog(value: Log): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRanges(value: js.Array[js.Tuple3[Double, Double, js.UndefOr[String]]]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangesNull: Self = StObject.set(x, "ranges", null)
      
      @scala.inline
      def setRangesVarargs(value: (js.Tuple3[Double, Double, js.UndefOr[String]])*): Self = StObject.set(x, "ranges", js.Array(value :_*))
      
      @scala.inline
      def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Range extends StObject {
    
    var opts: LimitLinebreaksCount = js.native
  }
  object Range {
    
    @scala.inline
    def apply(opts: LimitLinebreaksCount): Range = {
      val __obj = js.Dynamic.literal(opts = opts.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    @scala.inline
    implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpts(value: LimitLinebreaksCount): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tag extends StObject {
    
    var attributes: js.Array[TagAttribute] = js.native
    
    var lastClosingBracketAt: Double = js.native
    
    var lastOpeningBracketAt: Double = js.native
    
    var leftOuterWhitespace: Double = js.native
    
    var name: String = js.native
    
    var nameContainsLetters: Boolean = js.native
    
    var nameEnds: Double = js.native
    
    var nameStarts: Double = js.native
    
    var onlyPlausible: Boolean = js.native
    
    var slashPresent: Boolean = js.native
  }
  object Tag {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[TagAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesVarargs(value: TagAttribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setLastClosingBracketAt(value: Double): Self = StObject.set(x, "lastClosingBracketAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastOpeningBracketAt(value: Double): Self = StObject.set(x, "lastOpeningBracketAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftOuterWhitespace(value: Double): Self = StObject.set(x, "leftOuterWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameContainsLetters(value: Boolean): Self = StObject.set(x, "nameContainsLetters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameEnds(value: Double): Self = StObject.set(x, "nameEnds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameStarts(value: Double): Self = StObject.set(x, "nameStarts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyPlausible(value: Boolean): Self = StObject.set(x, "onlyPlausible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlashPresent(value: Boolean): Self = StObject.set(x, "slashPresent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TagAttribute extends StObject {
    
    var equalsAt: Double = js.native
    
    var name: String = js.native
    
    var nameEnds: Double = js.native
    
    var nameStarts: Double = js.native
    
    var value: String = js.native
    
    var valueEnds: Double = js.native
    
    var valueStarts: Double = js.native
  }
  object TagAttribute {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class TagAttributeMutableBuilder[Self <: TagAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEqualsAt(value: Double): Self = StObject.set(x, "equalsAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameEnds(value: Double): Self = StObject.set(x, "nameEnds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameStarts(value: Double): Self = StObject.set(x, "nameStarts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueEnds(value: Double): Self = StObject.set(x, "valueEnds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueStarts(value: Double): Self = StObject.set(x, "valueStarts", value.asInstanceOf[js.Any])
    }
  }
}
