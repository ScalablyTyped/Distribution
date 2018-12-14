package typings
package sharepointLib.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.Term")
@js.native
class Term () extends TermSetItem {
  def copy(doCopyChildren: scala.Boolean): Term = js.native
  def createLabel(labelName: java.lang.String, lcid: scala.Double, isDefault: scala.Boolean): Label = js.native
  def deleteAllLocalCustomProperties(): scala.Unit = js.native
  def deleteLocalCustomProperty(name: java.lang.String): scala.Unit = js.native
  def deprecate(doDepricate: scala.Boolean): scala.Unit = js.native
  def getAllLabels(lcid: scala.Double): LabelCollection = js.native
  def getDefaultLabel(lcid: scala.Double): Label = js.native
  def getDescription(lcid: scala.Double): sharepointLib.SPNs.StringResult = js.native
  def getIsDescendantOf(ancestorTerm: Term): sharepointLib.SPNs.BooleanResult = js.native
  def getPath(lcid: scala.Double): sharepointLib.SPNs.StringResult = js.native
  def getTerms(pagingLimit: scala.Double): TermCollection = js.native
  def getTerms(
    termLabel: java.lang.String,
    lcid: scala.Double,
    defaultLabelOnly: scala.Boolean,
    stringMatchOption: StringMatchOption,
    resultCollectionSize: scala.Double,
    trimUnavailable: scala.Boolean
  ): TermCollection = js.native
  def get_description(): java.lang.String = js.native
  def get_isDeprecated(): scala.Boolean = js.native
  def get_isKeyword(): scala.Boolean = js.native
  def get_isPinned(): scala.Boolean = js.native
  def get_isPinnedRoot(): scala.Boolean = js.native
  def get_isReused(): scala.Boolean = js.native
  def get_isRoot(): scala.Boolean = js.native
  def get_isSourceTerm(): scala.Boolean = js.native
  def get_labels(): LabelCollection = js.native
  def get_localCustomProperties(): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def get_mergedTermIds(): js.Array[sharepointLib.SPNs.Guid] = js.native
  def get_parent(): Term = js.native
  def get_pathOfTerm(): java.lang.String = js.native
  def get_pinSourceTermSet(): TermSet = js.native
  def get_reusedTerms(): TermCollection = js.native
  def get_sourceTerm(): Term = js.native
  def get_termSet(): TermSet = js.native
  def get_termSets(): TermSetCollection = js.native
  def get_termsCount(): scala.Double = js.native
  def merge(termToMerge: Term): scala.Unit = js.native
  def move(newParnt: TermSetItem): scala.Unit = js.native
  def reassignSourceTerm(reusedTerm: Term): scala.Unit = js.native
  def setDescription(description: java.lang.String, lcid: scala.Double): scala.Unit = js.native
  def setLocalCustomProperty(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

