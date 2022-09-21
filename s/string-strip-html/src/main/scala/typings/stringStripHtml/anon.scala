package typings.stringStripHtml

import typings.stringStripHtml.mod.CbObj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Enabled extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var putOnNewLine: js.UndefOr[Boolean] = js.undefined
    
    var wrapHeads: js.UndefOr[String] = js.undefined
    
    var wrapTails: js.UndefOr[String] = js.undefined
  }
  object Enabled {
    
    inline def apply(): Enabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enabled]
    }
    
    extension [Self <: Enabled](x: Self) {
      
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
  
  /* Inlined std.Partial<string-strip-html.string-strip-html.Opts> */
  trait PartialOpts extends StObject {
    
    var cb: js.UndefOr[Null | (js.Function1[/* cbObj */ CbObj, Unit])] = js.undefined
    
    var dumpLinkHrefsNearby: js.UndefOr[Enabled] = js.undefined
    
    var ignoreTags: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignoreTagsWithTheirContents: js.UndefOr[js.Array[String]] = js.undefined
    
    var onlyStripTags: js.UndefOr[js.Array[String]] = js.undefined
    
    var reportProgressFunc: js.UndefOr[Null | (js.Function1[/* percDone */ Double, Unit])] = js.undefined
    
    var reportProgressFuncFrom: js.UndefOr[Double] = js.undefined
    
    var reportProgressFuncTo: js.UndefOr[Double] = js.undefined
    
    var skipHtmlDecoding: js.UndefOr[Boolean] = js.undefined
    
    var stripRecognisedHTMLOnly: js.UndefOr[Boolean] = js.undefined
    
    var stripTogetherWithTheirContents: js.UndefOr[js.Array[String]] = js.undefined
    
    var trimOnlySpaces: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOpts {
    
    inline def apply(): PartialOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOpts]
    }
    
    extension [Self <: PartialOpts](x: Self) {
      
      inline def setCb(value: /* cbObj */ CbObj => Unit): Self = StObject.set(x, "cb", js.Any.fromFunction1(value))
      
      inline def setCbNull: Self = StObject.set(x, "cb", null)
      
      inline def setCbUndefined: Self = StObject.set(x, "cb", js.undefined)
      
      inline def setDumpLinkHrefsNearby(value: Enabled): Self = StObject.set(x, "dumpLinkHrefsNearby", value.asInstanceOf[js.Any])
      
      inline def setDumpLinkHrefsNearbyUndefined: Self = StObject.set(x, "dumpLinkHrefsNearby", js.undefined)
      
      inline def setIgnoreTags(value: js.Array[String]): Self = StObject.set(x, "ignoreTags", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTagsUndefined: Self = StObject.set(x, "ignoreTags", js.undefined)
      
      inline def setIgnoreTagsVarargs(value: String*): Self = StObject.set(x, "ignoreTags", js.Array(value*))
      
      inline def setIgnoreTagsWithTheirContents(value: js.Array[String]): Self = StObject.set(x, "ignoreTagsWithTheirContents", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTagsWithTheirContentsUndefined: Self = StObject.set(x, "ignoreTagsWithTheirContents", js.undefined)
      
      inline def setIgnoreTagsWithTheirContentsVarargs(value: String*): Self = StObject.set(x, "ignoreTagsWithTheirContents", js.Array(value*))
      
      inline def setOnlyStripTags(value: js.Array[String]): Self = StObject.set(x, "onlyStripTags", value.asInstanceOf[js.Any])
      
      inline def setOnlyStripTagsUndefined: Self = StObject.set(x, "onlyStripTags", js.undefined)
      
      inline def setOnlyStripTagsVarargs(value: String*): Self = StObject.set(x, "onlyStripTags", js.Array(value*))
      
      inline def setReportProgressFunc(value: /* percDone */ Double => Unit): Self = StObject.set(x, "reportProgressFunc", js.Any.fromFunction1(value))
      
      inline def setReportProgressFuncFrom(value: Double): Self = StObject.set(x, "reportProgressFuncFrom", value.asInstanceOf[js.Any])
      
      inline def setReportProgressFuncFromUndefined: Self = StObject.set(x, "reportProgressFuncFrom", js.undefined)
      
      inline def setReportProgressFuncNull: Self = StObject.set(x, "reportProgressFunc", null)
      
      inline def setReportProgressFuncTo(value: Double): Self = StObject.set(x, "reportProgressFuncTo", value.asInstanceOf[js.Any])
      
      inline def setReportProgressFuncToUndefined: Self = StObject.set(x, "reportProgressFuncTo", js.undefined)
      
      inline def setReportProgressFuncUndefined: Self = StObject.set(x, "reportProgressFunc", js.undefined)
      
      inline def setSkipHtmlDecoding(value: Boolean): Self = StObject.set(x, "skipHtmlDecoding", value.asInstanceOf[js.Any])
      
      inline def setSkipHtmlDecodingUndefined: Self = StObject.set(x, "skipHtmlDecoding", js.undefined)
      
      inline def setStripRecognisedHTMLOnly(value: Boolean): Self = StObject.set(x, "stripRecognisedHTMLOnly", value.asInstanceOf[js.Any])
      
      inline def setStripRecognisedHTMLOnlyUndefined: Self = StObject.set(x, "stripRecognisedHTMLOnly", js.undefined)
      
      inline def setStripTogetherWithTheirContents(value: js.Array[String]): Self = StObject.set(x, "stripTogetherWithTheirContents", value.asInstanceOf[js.Any])
      
      inline def setStripTogetherWithTheirContentsUndefined: Self = StObject.set(x, "stripTogetherWithTheirContents", js.undefined)
      
      inline def setStripTogetherWithTheirContentsVarargs(value: String*): Self = StObject.set(x, "stripTogetherWithTheirContents", js.Array(value*))
      
      inline def setTrimOnlySpaces(value: Boolean): Self = StObject.set(x, "trimOnlySpaces", value.asInstanceOf[js.Any])
      
      inline def setTrimOnlySpacesUndefined: Self = StObject.set(x, "trimOnlySpaces", js.undefined)
    }
  }
  
  trait PutOnNewLine extends StObject {
    
    var enabled: Boolean
    
    var putOnNewLine: Boolean
    
    var wrapHeads: String
    
    var wrapTails: String
  }
  object PutOnNewLine {
    
    inline def apply(enabled: Boolean, putOnNewLine: Boolean, wrapHeads: String, wrapTails: String): PutOnNewLine = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], putOnNewLine = putOnNewLine.asInstanceOf[js.Any], wrapHeads = wrapHeads.asInstanceOf[js.Any], wrapTails = wrapTails.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutOnNewLine]
    }
    
    extension [Self <: PutOnNewLine](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setPutOnNewLine(value: Boolean): Self = StObject.set(x, "putOnNewLine", value.asInstanceOf[js.Any])
      
      inline def setWrapHeads(value: String): Self = StObject.set(x, "wrapHeads", value.asInstanceOf[js.Any])
      
      inline def setWrapTails(value: String): Self = StObject.set(x, "wrapTails", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeTakenInMilliseconds extends StObject {
    
    var timeTakenInMilliseconds: Double
  }
  object TimeTakenInMilliseconds {
    
    inline def apply(timeTakenInMilliseconds: Double): TimeTakenInMilliseconds = {
      val __obj = js.Dynamic.literal(timeTakenInMilliseconds = timeTakenInMilliseconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeTakenInMilliseconds]
    }
    
    extension [Self <: TimeTakenInMilliseconds](x: Self) {
      
      inline def setTimeTakenInMilliseconds(value: Double): Self = StObject.set(x, "timeTakenInMilliseconds", value.asInstanceOf[js.Any])
    }
  }
}
