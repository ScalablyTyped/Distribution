package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomainName extends js.Object {
  var domainName: String
  var resourceRecordName: String
  var resourceRecordType: String
  var resourceRecordValue: String
}

object Anon_DomainName {
  @scala.inline
  def apply(
    domainName: String,
    resourceRecordName: String,
    resourceRecordType: String,
    resourceRecordValue: String
  ): Anon_DomainName = {
    val __obj = js.Dynamic.literal(domainName = domainName, resourceRecordName = resourceRecordName, resourceRecordType = resourceRecordType, resourceRecordValue = resourceRecordValue)
  
    __obj.asInstanceOf[Anon_DomainName]
  }
}

