package typings.reactPlaidLink.mod

import typings.react.mod.FC
import typings.reactPlaidLink.anon.Children
import typings.reactPlaidLink.anon.Error
import typings.reactPlaidLink.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def PlaidLink: FC[PlaidLinkPropTypes] = ^.asInstanceOf[js.Dynamic].selectDynamic("PlaidLink").asInstanceOf[FC[PlaidLinkPropTypes]]

/**
  * This hook loads Plaid script and manages the Plaid Link creation for you.
  * You get easy open & exit methods to call and loading & error states.
  *
  * This will destroy the Plaid UI on un-mounting so it's up to you to be
  * graceful to the user.
  *
  * A new Plaid instance is created every time the token and products options change.
  * It's up to you to prevent unnecessary re-creations on re-render.
  */
inline def usePlaidLink(options: PlaidLinkOptions): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("usePlaidLink")(options.asInstanceOf[js.Any]).asInstanceOf[Error]

type PlaidLinkOnEvent = js.Function2[
/* eventName */ PlaidLinkStableEvent | String, 
/* metadata */ PlaidLinkOnEventMetadata, 
Unit]

type PlaidLinkOnExit = js.Function2[/* error */ Null | PlaidLinkError, /* metadata */ PlaidLinkOnExitMetadata, Unit]

type PlaidLinkOnLoad = js.Function0[Unit]

type PlaidLinkOnSuccess = js.Function2[/* public_token */ String, /* metadata */ PlaidLinkOnSuccessMetadata, Unit]

type PlaidLinkPropTypes = PlaidLinkOptions & Children
