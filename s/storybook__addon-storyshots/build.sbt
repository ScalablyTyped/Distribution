organization := "org.scalablytyped"
name := "storybook__addon-storyshots"
version := "5.3.19-6a8273"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__compiler" % "10.0.7-33435e",
  "org.scalablytyped" %%% "angular__core" % "10.0.7-172a73",
  "org.scalablytyped" %%% "csstype" % "3.0.2-b6fa26",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-bf2ead",
  "org.scalablytyped" %%% "emotion__core" % "10.0.28-97ae26",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.16-103cdd",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.27-f2e823",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.31-5071ed",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-dada02",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.4-b346ef",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200706Z-0febbd",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200518Z-4d6e63",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200721Z-bd5cf0",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200722Z-1ab554",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-e00af9",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-64dc32",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200426Z-36e2b6",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200711Z-7368c8",
  "org.scalablytyped" %%% "rxjs" % "6.6.2-ccb1c2",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.2-08247c",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "storybook__addons" % "5.3.19-eafc23",
  "org.scalablytyped" %%% "storybook__api" % "5.3.19-630cc6",
  "org.scalablytyped" %%% "storybook__channels" % "5.3.19-461e38",
  "org.scalablytyped" %%% "storybook__client-api" % "5.3.19-2d3f8a",
  "org.scalablytyped" %%% "storybook__router" % "5.3.19-55af58",
  "org.scalablytyped" %%% "storybook__theming" % "5.3.19-5c3f2b",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200515Z-efda06",
  "org.scalablytyped" %%% "typescript" % "3.9.7-9f5184")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
