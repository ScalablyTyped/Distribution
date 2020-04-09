package typings.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tokenMod {
  type CustomerData = typings.recurlyRecurlyJs.mod.Address
  type ElementsToken = js.Function3[
    /* elements */ typings.recurlyRecurlyJs.elementsMod.ElementsInstance, 
    /* second */ typings.std.HTMLFormElement | typings.recurlyRecurlyJs.tokenMod.CustomerData, 
    /* third */ typings.recurlyRecurlyJs.tokenMod.TokenHandler, 
    scala.Unit
  ]
  type HostedFieldToken = js.Function2[
    /* form */ typings.std.HTMLFormElement | typings.recurlyRecurlyJs.tokenMod.CustomerData, 
    /* second */ typings.recurlyRecurlyJs.tokenMod.TokenHandler, 
    scala.Unit
  ]
  type Token = typings.recurlyRecurlyJs.tokenMod.HostedFieldToken with typings.recurlyRecurlyJs.tokenMod.ElementsToken
  type TokenHandler = js.Function2[
    /* error */ typings.recurlyRecurlyJs.errorMod.RecurlyError | scala.Null, 
    /* token */ typings.recurlyRecurlyJs.tokenMod.TokenPayload, 
    scala.Unit
  ]
}
