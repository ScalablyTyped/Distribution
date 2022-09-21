organization := "org.scalablytyped"
name := "schematics__angular"
version := "14.2.3-488f54"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-025d79",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.3-50f405",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.3-5a4773",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-14a0e5",
  "org.scalablytyped" %%% "magic-string" % "0.26.3-bbf904",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "re2" % "1.17.7-22ea4f",
  "org.scalablytyped" %%% "source-map" % "0.7.4-e0c113",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-33748e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
