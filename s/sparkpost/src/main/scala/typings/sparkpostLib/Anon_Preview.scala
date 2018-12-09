package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Preview extends js.Object {
  /**
           * Create a new template
           *
           * @param template an object of [template attributes]{@link https://developers.sparkpost.com/api/templates#header-template-attributes}
           * @returns The template id results
           */
  def create(template: sparkpostLib.sparkpostMod.SparkPostNs.CreateTemplate): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[Anon_Id] = js.native
  /**
           * Create a new template
           *
           * @param template an object of [template attributes]{@link https://developers.sparkpost.com/api/templates#header-template-attributes}
           * @param callback The request callback with template id results
           */
  def create(
    template: sparkpostLib.sparkpostMod.SparkPostNs.CreateTemplate,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[Anon_Id]
  ): scala.Unit = js.native
  /**
           * Delete an existing template
           *
           * @param id The template id
           * @returns Promise void
           */
  def delete(id: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
           * Delete an existing template
           * @param id The template id
           * @param callback The request callback
           */
  def delete(id: java.lang.String, callback: sparkpostLib.sparkpostMod.SparkPostNs.Callback[scala.Unit]): scala.Unit = js.native
  /**
           * Retrieve details about a specified template by its id
           *
           * @param id the id of the template you want to look up
           * @param [options] specifies a draft or published template
           * @returns The Template results
           */
  def get(id: java.lang.String): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[sparkpostLib.sparkpostMod.SparkPostNs.Template] = js.native
  /**
           * Retrieve details about a specified template by its id
           *
           * @param id the id of the template you want to look up
           * @param callback The request callback with Template results
           */
  def get(
    id: java.lang.String,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[sparkpostLib.sparkpostMod.SparkPostNs.Template]
  ): scala.Unit = js.native
  /**
           * Retrieve details about a specified template by its id
           *
           * @param id the id of the template you want to look up
           * @param [options] specifies a draft or published template
           * @returns The Template results
           */
  def get(id: java.lang.String, options: Anon_DraftBoolean): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[sparkpostLib.sparkpostMod.SparkPostNs.Template] = js.native
  /**
           * Retrieve details about a specified template by its id
           *
           * @param id the id of the template you want to look up
           * @param options specifies a draft or published template
           * @param callback The request callback with Template results
           */
  def get(
    id: java.lang.String,
    options: Anon_DraftBoolean,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[sparkpostLib.sparkpostMod.SparkPostNs.Template]
  ): scala.Unit = js.native
  /**
           * List a summary of all templates.
           *
           * @returns The TemplateMeta results array
           */
  def list(): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[js.Array[sparkpostLib.sparkpostMod.SparkPostNs.TemplateMeta]] = js.native
  /**
           * List a summary of all templates.
           * @param callback The request callback with TemplateMeta results array
           */
  def list(
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[js.Array[sparkpostLib.sparkpostMod.SparkPostNs.TemplateMeta]]
  ): scala.Unit = js.native
  /**
           * Preview the most recent version of an existing template by id
           *
           * @param id the id of the template you want to look up
           * @returns The webhook id results
           */
  def preview(id: java.lang.String): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[sparkpostLib.sparkpostMod.SparkPostNs.TemplateContent] = js.native
  /**
           * Preview the most recent version of an existing template by id
           *
           * @param id the id of the template you want to look up
           * @param callback The request callback with webhook id results
           */
  def preview(
    id: java.lang.String,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[sparkpostLib.sparkpostMod.SparkPostNs.TemplateContent]
  ): scala.Unit = js.native
  /**
           * Preview the most recent version of an existing template by id
           *
           * @param id the id of the template you want to look up
           * @returns The webhook id results
           */
  def preview(id: java.lang.String, options: Anon_Draft): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[sparkpostLib.sparkpostMod.SparkPostNs.TemplateContent] = js.native
  /**
           * Preview the most recent version of an existing template by id
           *
           * @param id the id of the template you want to look up
           * @param options The preview options
           * @param callback The request callback with webhook id results
           */
  def preview(
    id: java.lang.String,
    options: Anon_Draft,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[sparkpostLib.sparkpostMod.SparkPostNs.TemplateContent]
  ): scala.Unit = js.native
  /**
           * Update an existing template
           *
           * @param id the id of the template you want to update
           * @param template an object of [template attributes]{@link https://developers.sparkpost.com/api/templates#header-template-attributes}
           * @param options If true, directly overwrite the existing published template. If false, create a new draft
           * @returns The template id results
           */
  def update(id: java.lang.String, template: sparkpostLib.sparkpostMod.SparkPostNs.UpdateTemplate): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[Anon_Id] = js.native
  /**
           * Update an existing template
           *
           * @param id the id of the template you want to update
           * @param template an object of [template attributes]{@link https://developers.sparkpost.com/api/templates#header-template-attributes}
           * @param callback The request callback with template id results
           */
  def update(
    id: java.lang.String,
    template: sparkpostLib.sparkpostMod.SparkPostNs.UpdateTemplate,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[Anon_Id]
  ): scala.Unit = js.native
  /**
           * Update an existing template
           *
           * @param id the id of the template you want to update
           * @param template an object of [template attributes]{@link https://developers.sparkpost.com/api/templates#header-template-attributes}
           * @param options If true, directly overwrite the existing published template. If false, create a new draft
           * @returns The template id results
           */
  def update(
    id: java.lang.String,
    template: sparkpostLib.sparkpostMod.SparkPostNs.UpdateTemplate,
    options: Anon_Updatepublished
  ): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[Anon_Id] = js.native
  /**
           * Update an existing template
           *
           * @param id the id of the template you want to update
           * @param template an object of [template attributes]{@link https://developers.sparkpost.com/api/templates#header-template-attributes}
           * @param options The create options. If true, directly overwrite the existing published template. If false, create a new draft
           * @param callback The request callback with template id results
           */
  def update(
    id: java.lang.String,
    template: sparkpostLib.sparkpostMod.SparkPostNs.UpdateTemplate,
    options: Anon_Updatepublished,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[Anon_Id]
  ): scala.Unit = js.native
}

