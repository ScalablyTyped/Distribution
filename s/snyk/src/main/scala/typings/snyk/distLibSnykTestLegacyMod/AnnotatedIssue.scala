package typings.snyk.distLibSnykTestLegacyMod

import org.scalablytyped.runtime.StringDictionary
import typings.snyk.anon.VulnerableByDistro
import typings.snyk.snykBooleans.`false`
import typings.snyk.snykStrings.license
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotatedIssue
  extends StObject
     with IssueData {
  
  var __filename: js.UndefOr[String] = js.undefined
  
  var bundled: js.UndefOr[Any] = js.undefined
  
  var credit: js.Array[String]
  
  @JSName("from")
  var from_AnnotatedIssue: js.Array[String]
  
  var identifiers: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  
  var isPatchable: Boolean
  
  var isUpgradable: Boolean
  
  @JSName("name")
  var name_AnnotatedIssue: String
  
  var note: js.UndefOr[String | `false`] = js.undefined
  
  var originalSeverity: js.UndefOr[SEVERITY] = js.undefined
  
  var parentDepType: String
  
  var patch: js.UndefOr[Any] = js.undefined
  
  var publicationTime: js.UndefOr[String] = js.undefined
  
  var shrinkwrap: js.UndefOr[Any] = js.undefined
  
  var `type`: js.UndefOr[license] = js.undefined
  
  var upgradePath: js.Array[String | Boolean]
}
object AnnotatedIssue {
  
  inline def apply(
    below: String,
    credit: js.Array[String],
    description: String,
    fixedIn: js.Array[String],
    from: js.Array[String],
    id: String,
    isNew: Boolean,
    isPatchable: Boolean,
    isUpgradable: Boolean,
    name: String,
    packageName: String,
    parentDepType: String,
    patches: js.Array[Patch],
    semver: VulnerableByDistro,
    severity: SEVERITY,
    title: String,
    upgradePath: js.Array[String | Boolean],
    version: String
  ): AnnotatedIssue = {
    val __obj = js.Dynamic.literal(below = below.asInstanceOf[js.Any], credit = credit.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fixedIn = fixedIn.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isNew = isNew.asInstanceOf[js.Any], isPatchable = isPatchable.asInstanceOf[js.Any], isUpgradable = isUpgradable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], parentDepType = parentDepType.asInstanceOf[js.Any], patches = patches.asInstanceOf[js.Any], semver = semver.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], upgradePath = upgradePath.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotatedIssue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnnotatedIssue] (val x: Self) extends AnyVal {
    
    inline def setBundled(value: Any): Self = StObject.set(x, "bundled", value.asInstanceOf[js.Any])
    
    inline def setBundledUndefined: Self = StObject.set(x, "bundled", js.undefined)
    
    inline def setCredit(value: js.Array[String]): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
    
    inline def setCreditVarargs(value: String*): Self = StObject.set(x, "credit", js.Array(value*))
    
    inline def setFrom(value: js.Array[String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromVarargs(value: String*): Self = StObject.set(x, "from", js.Array(value*))
    
    inline def setIdentifiers(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
    
    inline def setIdentifiersUndefined: Self = StObject.set(x, "identifiers", js.undefined)
    
    inline def setIsPatchable(value: Boolean): Self = StObject.set(x, "isPatchable", value.asInstanceOf[js.Any])
    
    inline def setIsUpgradable(value: Boolean): Self = StObject.set(x, "isUpgradable", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNote(value: String | `false`): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setOriginalSeverity(value: SEVERITY): Self = StObject.set(x, "originalSeverity", value.asInstanceOf[js.Any])
    
    inline def setOriginalSeverityUndefined: Self = StObject.set(x, "originalSeverity", js.undefined)
    
    inline def setParentDepType(value: String): Self = StObject.set(x, "parentDepType", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Any): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    inline def setPublicationTime(value: String): Self = StObject.set(x, "publicationTime", value.asInstanceOf[js.Any])
    
    inline def setPublicationTimeUndefined: Self = StObject.set(x, "publicationTime", js.undefined)
    
    inline def setShrinkwrap(value: Any): Self = StObject.set(x, "shrinkwrap", value.asInstanceOf[js.Any])
    
    inline def setShrinkwrapUndefined: Self = StObject.set(x, "shrinkwrap", js.undefined)
    
    inline def setType(value: license): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpgradePath(value: js.Array[String | Boolean]): Self = StObject.set(x, "upgradePath", value.asInstanceOf[js.Any])
    
    inline def setUpgradePathVarargs(value: (String | Boolean)*): Self = StObject.set(x, "upgradePath", js.Array(value*))
    
    inline def set__filename(value: String): Self = StObject.set(x, "__filename", value.asInstanceOf[js.Any])
    
    inline def set__filenameUndefined: Self = StObject.set(x, "__filename", js.undefined)
  }
}
