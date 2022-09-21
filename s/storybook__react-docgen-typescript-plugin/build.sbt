organization := "org.scalablytyped"
name := "storybook__react-docgen-typescript-plugin"
version := "1.0.1-991eed"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-025d79",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-bee5c7",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-aaec85",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-737217",
  "org.scalablytyped" %%% "re2" % "1.17.7-22ea4f",
  "org.scalablytyped" %%% "react-docgen-typescript" % "2.2.2-64bfb5",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-ca6ee9",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "tapable" % "2.2.1-b2feca",
  "org.scalablytyped" %%% "typescript" % "4.8.3-775b25",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-33748e",
  "org.scalablytyped" %%% "webpack" % "5.74.0-8b6e44")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
